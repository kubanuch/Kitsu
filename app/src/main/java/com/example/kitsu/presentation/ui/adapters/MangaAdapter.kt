package com.example.kitsu.presentation.ui.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsu.base.BaseDiffUtil
import com.example.kitsu.common.extensions.setImage
import com.example.kitsu.databinding.ItemMangaBinding
import com.example.kitsu.presentation.models.mangamodels.MangaModelUi

class MangaAdapter(val onItemClickListener: (id: String) -> Unit) :
    PagingDataAdapter<MangaModelUi, MangaAdapter.MangaViewHolder>(BaseDiffUtil()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MangaViewHolder {
        return MangaViewHolder(
            ItemMangaBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: MangaViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    inner class MangaViewHolder(private val binding: ItemMangaBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun onBind(model: MangaModelUi) {
            model.attributes?.posterImage?.let { binding.imageManga.setImage(it.original) }
            binding.root.setOnClickListener {
                model.id?.let { it1 -> onItemClickListener(it1) }
            }
        }

    }
}

