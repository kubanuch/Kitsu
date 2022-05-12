package com.example.kitsu.presentation.ui.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsu.base.BaseDiffUtil
import com.example.kitsu.common.extensions.setImage
import com.example.kitsu.databinding.ItemAnimeBinding
import com.example.kitsu.presentation.models.animemodels.AnimeModelUi

class AnimeAdapter(val onItemClickListener: (id: String, videoId: String) -> Unit) :
    PagingDataAdapter<AnimeModelUi, AnimeAdapter.AnimeViewHolder>(BaseDiffUtil()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AnimeViewHolder {
        return AnimeViewHolder(
            ItemAnimeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    inner class AnimeViewHolder(private val binding: ItemAnimeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: AnimeModelUi) {
            model.attributes?.posterImage?.let { binding.imageAnime.setImage(it.original) }

            binding.root.setOnClickListener {
                model.attributes?.youtubeVideoId?.let { it1 ->
                    model.id?.let { it2 ->
                        onItemClickListener(
                            it2, it1
                        )
                    }
                }
            }
        }


    }

}