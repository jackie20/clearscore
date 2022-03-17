package com.mukundi.clearscoreassessment.services


data class CreditScoreResponse(
    val creditReportInfo: CreditReportInfo
)

data class CreditReportInfo(
    val score: Int,
    val minScoreValue: Int,
    val maxScoreValue: Int
)