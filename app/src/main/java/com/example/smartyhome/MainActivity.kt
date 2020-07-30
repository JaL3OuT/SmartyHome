package com.example.smartyhome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import androidx.annotation.DrawableRes
import com.example.smartyhome.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var sessionManager: SessionManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnContinue.setOnClickListener {
            sessionManager = SessionManager(this)
            if (!isEmpty()) {
                sessionManager.saveLoginDetails(binding.inputName.text.toString(), true)
                startActivity(Intent(this, HomeActivity::class.java))
                finish()
            }
        }

    }

    fun isEmpty(): Boolean {
        var empty = false
        if (TextUtils.isEmpty(binding.inputName.text)) {
            binding.inputName.error = "is Empty"
            empty = true
        }
        return empty
    }

}
