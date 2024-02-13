package com.anderson.creditapplicationsystem.dto

import com.anderson.creditapplicationsystem.entity.Credit
import com.anderson.creditapplicationsystem.enumetations.Status
import java.math.BigDecimal
import java.util.UUID

class CreditView(
    val creditCode: UUID,
    val creditValue: BigDecimal,
    val numberOfInstallment: Int,
    val status: Status,
    val emailCustomer: String?,
    val incomeCustomer: BigDecimal?
){
    constructor(credit: Credit):this(
        creditCode = credit.creditCode,
        creditValue = credit.creditValue,
        numberOfInstallment = credit.numberOfInstallments,
        status = credit.status,
        emailCustomer = credit.customer?.email,
        incomeCustomer = credit.customer?.income
    )
}


