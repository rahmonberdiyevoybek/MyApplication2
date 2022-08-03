package com.example.myapplication2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.databinding.PostItemLayoutBinding

class PostAdapter(val items: Array<PostModel>): RecyclerView.Adapter<PostAdapter.ItemHolder>() {
    inner class ItemHolder(val binding: PostItemLayoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
         return ItemHolder(PostItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
      val item=items[position]
        holder.binding.imgPost.setImageResource(item.image)
        holder.binding.tvTitle.text=item.title
        holder.binding.tvComment.text=item.comment
    }

    override fun getItemCount(): Int {
        return items.count()

    }
}