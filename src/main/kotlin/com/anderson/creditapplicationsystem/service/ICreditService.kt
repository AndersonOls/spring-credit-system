package com.anderson.creditapplicationsystem.service

import com.anderson.creditapplicationsystem.entity.Credit
import java.util.*

interface ICreditService {
    fun save(credit: Credit) : Credit

    fun findAllByCustomer(customerId: Long): List<Credit>

    fun findByCreditCode(customerId: Long, creditCode: UUID): Credit
}