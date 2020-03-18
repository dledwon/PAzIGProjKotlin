package com.example.pazigprojkotlin

import android.app.Application
import org.koin.core.context.startKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class ApplicationSetup : Application(){
    override fun onCreate() {
        super.onCreate()

        // Start Koin
        startKoin{
            androidLogger()
            androidContext(this@ApplicationSetup)
            modules(appModule)
        }
    }
}