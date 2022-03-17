package com.mukundi.clearscoreassessment.modules


import com.google.gson.Gson
import com.mukundi.clearscoreassessment.BuildConfig
import com.mukundi.clearscoreassessment.services.AppConstants
import com.mukundi.clearscoreassessment.services.ClearScoreApi
import com.mukundi.clearscoreassessment.services.ClearScoreService
import dagger.Module
import dagger.Provides
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject
import javax.inject.Singleton


@Module
class ServiceModule {

    @Provides
    @Singleton
    @Inject
    internal fun provideClearScoreService(clearScoreApi: ClearScoreApi): ClearScoreService {
        return ClearScoreService(clearScoreApi)
    }

    @Provides
    @Singleton
    @Inject
    internal fun provideClearScoreAPI(retrofitBuilder: Retrofit.Builder): ClearScoreApi {
      //  val retrofit = retrofitBuilder.baseUrl("https://android-interview.s3.eu-west-2.amazonaws.com/endpoint.json").build()
        val retrofit = retrofitBuilder.baseUrl(AppConstants().BaseURL).build()
        return retrofit.create(ClearScoreApi::class.java)
    }


    @Provides
    @Singleton
    internal fun provideRetrofitBuilder(): Retrofit.Builder {
        return Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
            .addConverterFactory(GsonConverterFactory.create(Gson()))
    }

}