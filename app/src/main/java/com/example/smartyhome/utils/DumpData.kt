package com.example.smartyhome.utils

import android.text.format.DateFormat
import com.example.smartyhome.BaseApplication
import com.example.smartyhome.R
import com.example.smartyhome.SessionManager
import com.example.smartyhome.model.Data
import com.example.smartyhome.model.Item
import java.util.*

val list = listOf(
    Item(1, R.drawable.livingroom, "livingroom", 4),
    Item(2, R.drawable.mediaroom, "mediaroom", 6),
    Item(3, R.drawable.bathroom, "bathroom", 1),
    Item(4, R.drawable.bedroom, "bedroom", 3)
)

val dumpdata = Data(
    DateFormat.format("MMMM dd, yyyy", Date()).toString(),
    BaseApplication.sessionManager.getUserName(),
    list
)