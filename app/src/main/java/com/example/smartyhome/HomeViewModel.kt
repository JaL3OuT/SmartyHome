package com.example.smartyhome

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.smartyhome.model.Data
import com.example.smartyhome.utils.dumpdata

class HomeViewModel() : ViewModel() {

    private val _text = MutableLiveData<Data>().apply {
        value = dumpdata
    }

    val date: LiveData<Data> = _text
}