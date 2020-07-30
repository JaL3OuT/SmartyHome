package com.example.smartyhome

import android.content.Context
import android.content.SharedPreferences

class SessionManager(private val context: Context) {

    private var editor: SharedPreferences.Editor

    init {
        val sharedPreferences =
            context.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE)
        editor = sharedPreferences.edit()

    }

    fun saveLoginDetails(name: String?, connected: Boolean) {
        editor.putString("Name", name)
        editor.putBoolean("Connected", connected)
        editor.commit()
    }

    fun getUserName(): String {
        val sharedPreferences: SharedPreferences =
            context.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE)
        return sharedPreferences.getString("Name", "")!!
    }

    fun getConnexion(): Boolean? {
        val sharedPreferences: SharedPreferences =
            context.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE)
        return sharedPreferences.getBoolean("Connected", false)

    }
}