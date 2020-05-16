package com.example.indeveluptest

import android.app.Application
import com.example.data.di.dataModule
import com.example.domain.di.domainModule
import com.example.indeveluptest.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

@Suppress("unused")
class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(listOf(appModule, domainModule, dataModule))
        }
    }
}