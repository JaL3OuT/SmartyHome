package com.example.smartyhome.model

import androidx.annotation.DrawableRes
import androidx.recyclerview.widget.DiffUtil

data class Item(
    val id: Int,
    @DrawableRes val image: Int,
    val roomName: String,
    val deviceCount: Int
)


object ItemDiffCallback : DiffUtil.ItemCallback<Item>() {
    override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
        return oldItem == newItem
    }

}