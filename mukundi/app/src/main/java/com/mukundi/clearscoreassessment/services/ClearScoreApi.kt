package com.mukundi.clearscoreassessment.services
import io.reactivex.Single
import retrofit2.http.GET
interface ClearScoreApi {
    @GET("endpoint.json")
    fun getCredit(): Single<CreditScoreResponse>
}