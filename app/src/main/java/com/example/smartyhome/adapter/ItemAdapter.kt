package com.example.smartyhome.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.smartyhome.R
import com.example.smartyhome.databinding.ItemListBinding
import com.example.smartyhome.model.Item
import com.example.smartyhome.model.ItemDiffCallback
import kotlinx.android.synthetic.main.item_list.view.*

class ItemAdapter : ListAdapter<Item, MyViewHolder>(ItemDiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
return MyViewHolder(
    ItemListBinding.inflate(
        LayoutInflater.from(parent.context),
        parent,
        false
    ) )  }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(item = getItem(position))
    }

}

class MyViewHolder(itemView: ItemListBinding) : RecyclerView.ViewHolder(itemView.root) {

    fun bind(item: Item) {
        itemView.imageView_room.setImageResource(item.image)
        itemView.name_Room.text= item.roomName
        itemView.device_count.text = itemView.context.getString(R.string.devices, item.deviceCount)
    }
}