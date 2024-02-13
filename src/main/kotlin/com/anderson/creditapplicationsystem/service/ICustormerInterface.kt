package com.anderson.creditapplicationsystem.service

import com.anderson.creditapplicationsystem.entity.Customer

interface ICustormerInterface {
    fun save(customer: Customer): Customer

    fun findById(id: Long): Customer

    fun delete(id: Long)
}