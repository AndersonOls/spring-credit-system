package com.anderson.creditapplicationsystem.service.impl

import com.anderson.creditapplicationsystem.entity.Credit
import com.anderson.creditapplicationsystem.repository.CreditRepository
import com.anderson.creditapplicationsystem.service.ICreditService
import org.springframework.stereotype.Service
import java.util.*
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Private

@Service
class CreditService(
    private val creditRepository: CreditRepository,
    private val customerService: CustomerService
): ICreditService {
    override fun save(credit: Credit): Credit {
        credit.apply {
            customer = customerService.findById(credit.customer?.id!!)
        }
        return  this.creditRepository.save(credit)
    }

    override fun findAllByCustomer(customerId: Long): List<Credit> =
        this.creditRepository.findAllByCustomer(customerId)
    override fun findByCreditCode(customerId: Long, creditCode: UUID): Credit {
        val credit: Credit = this.creditRepository.findByCreditCode(creditCode) ?: throw RuntimeException("Creditcode $creditCode not found")
        return if(credit.customer?.id == customerId) credit else throw RuntimeException("Contact admin")
    }
}