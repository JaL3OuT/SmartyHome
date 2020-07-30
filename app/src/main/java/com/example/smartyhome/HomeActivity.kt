package com.example.smartyhome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.smartyhome.adapter.ItemAdapter
import com.example.smartyhome.databinding.ActivityHomeBinding
import com.example.smartyhome.databinding.ActivityMainBinding
import kotlin.math.log

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = ItemAdapter()

        binding.recyclerList.apply {
            this.adapter = adapter
        }
        val viewModel = ViewModelProvider(this)[HomeViewModel::class.java]
        viewModel.date.observe(this, Observer {
            binding.date.text = it.time
            binding.name.text = getString(R.string.welcome, it.name)
            adapter.submitList(it.listComponents)
            adapter.notifyDataSetChanged()
        })


    }
}