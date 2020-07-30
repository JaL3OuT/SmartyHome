package com.example.smartyhome

import android.app.Application
import android.content.Intent

class BaseApplication : Application() {


    companion object{
        lateinit var sessionManager: SessionManager
    }

    override fun onCreate() {
        super.onCreate()
        sessionManager = SessionManager(this)

        if (sessionManager.getConnexion()!!)
        {
            startActivity(Intent(this , HomeActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }
}