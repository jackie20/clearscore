package com.mukundi.clearscoreassessment

import com.mukundi.clearscoreassessment.services.ClearScoreService
import io.reactivex.Single
import javax.inject.Inject


class MainViewModel @Inject constructor(private val clearScoreService: ClearScoreService) {

    fun getCreditScore(): Single<MainUiModel> {

        return clearScoreService.getCrediScore().map {
            MainUiModel(it.creditReportInfo.score,
                it.creditReportInfo.minScoreValue,
                it.creditReportInfo.maxScoreValue)
        }
    }
}//class MainViewModel @Inject constructor(private val clearScoreService: ClearScoreService) {