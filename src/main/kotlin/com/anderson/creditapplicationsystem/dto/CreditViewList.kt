package com.anderson.creditapplicationsystem.dto

import com.anderson.creditapplicationsystem.entity.Credit
import java.math.BigDecimal
import java.util.UUID

class CreditViewList(
    val creditCode: UUID,
    val creditValue: BigDecimal,
    val numberOfInstallments: Int
) {
    constructor(credit: Credit) : this(
        creditCode = credit.creditCode,
        creditValue = credit.creditValue,
        numberOfInstallments = credit.numberOfInstallments
    )
}