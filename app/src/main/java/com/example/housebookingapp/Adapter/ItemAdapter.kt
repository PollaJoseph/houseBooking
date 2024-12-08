package com.example.housebookingapp.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.housebookingapp.Activity.DetailsActivity
import com.example.housebookingapp.Model.ItemDomain
import com.example.housebookingapp.databinding.ViewHolderItemBinding

class ItemAdapter (private val items:ArrayList<ItemDomain>):
    RecyclerView.Adapter<ItemAdapter.ViewHolder>(){
        private lateinit var context: Context

    class ViewHolder(val binding: ViewHolderItemBinding):RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.ViewHolder {
        val binding=ViewHolderItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        context=parent.context
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemAdapter.ViewHolder, position: Int) {
        val item=items[position]
        with(holder.binding){
            title.text=item.title
            price.text="${item.price} $"
            bedNumber.text=item.bed.toString()
            bathNumber.text=item.bath.toString()


            val drawableResourceId=holder.itemView.resources.getIdentifier(
                item.imagePath,"drawable",holder.itemView.context.packageName
            )

            Glide.with(context)
                .load(drawableResourceId)
                .into(itemImage)

            holder.itemView.setOnClickListener {
                val intent=Intent(context,DetailsActivity::class.java)
                intent.putExtra("object",item)
                context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int =items.size



}