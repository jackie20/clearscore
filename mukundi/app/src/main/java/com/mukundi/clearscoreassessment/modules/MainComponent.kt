package com.mukundi.clearscoreassessment.modules
import com.mukundi.clearscoreassessment.MainActivity
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [(ServiceModule::class)])

 interface MainComponent {
    fun inject(mainActivity: MainActivity?)
}
