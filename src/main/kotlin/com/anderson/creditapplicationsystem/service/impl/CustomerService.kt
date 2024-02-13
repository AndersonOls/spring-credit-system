package com.anderson.creditapplicationsystem.service.impl

import com.anderson.creditapplicationsystem.entity.Customer
import com.anderson.creditapplicationsystem.repository.CustomerRepository
import com.anderson.creditapplicationsystem.service.ICustormerInterface
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val customerRepository: CustomerRepository
): ICustormerInterface {
    override fun save(customer: Customer): Customer =
        this.customerRepository.save(customer)

    override fun findById(id: Long): Customer =
        this.customerRepository.findById(id).orElseThrow{
            throw RuntimeException("Id $id not found")
        }

    override fun delete(id: Long) =
        this.customerRepository.deleteById(id)


}