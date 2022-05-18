package com.example.kitsu.presentation.ui.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsu.base.BaseDiffUtil
import com.example.kitsu.databinding.ItemGenresBinding
import com.example.kitsu.presentation.models.genresmodels.GenresModelsUi

class GenresAdapter :
    ListAdapter<GenresModelsUi, GenresAdapter.GenresViewHolder>(BaseDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenresViewHolder {
        return GenresViewHolder(ItemGenresBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    }

    override fun onBindViewHolder(holder: GenresViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    inner class GenresViewHolder(private val binding: ItemGenresBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: GenresModelsUi) {
            binding.tvGenres.text = model.attributes.name


        }


    }

}