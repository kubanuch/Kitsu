package com.example.kitsu.presentation.ui.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsu.base.BaseDiffUtil
import com.example.kitsu.common.extensions.setImage
import com.example.kitsu.databinding.ItemHeroesBinding
import com.example.kitsu.presentation.models.PixaBayModelUI

class PixaBayAdapter :
    ListAdapter<PixaBayModelUI, PixaBayAdapter.HeroesViewHolder>(BaseDiffUtil()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HeroesViewHolder {
        return HeroesViewHolder(
            ItemHeroesBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: HeroesViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    inner class HeroesViewHolder(private val binding: ItemHeroesBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun onBind(model: PixaBayModelUI) {
            model.largeImageURL?.let { binding.image.setImage(it) }
            binding.closeTv.text = model.tags

        }
    }

}