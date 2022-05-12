package com.example.kitsu.presentation.ui.fragment.main.anime

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.base.BaseFragment
import com.example.kitsu.databinding.FragmentAnimeBinding
import com.example.kitsu.presentation.ui.adapters.AnimeAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnimeFragment : BaseFragment<FragmentAnimeBinding, AnimeViewModel>(
    R.layout.fragment_anime
) {
    override val viewModel: AnimeViewModel by viewModels()
    override val binding by viewBinding(FragmentAnimeBinding::bind)
    private val animeAdapter = AnimeAdapter(this::onItemClickListener)
    private val _animeAdapter = AnimeAdapter(this::onItemClickListener)

    override fun setupViews() {
        setupAdapter()
    }

    private fun setupAdapter() {
        binding.recyclerviewRating.adapter = animeAdapter
        binding.recyclerviewPopular.adapter = _animeAdapter
    }

    override fun launchObservers() {
        setupSubscribesRating()
        setupSubscribesPopular()
    }

    private fun setupSubscribesRating() {
        viewModel.fetchPopularAnime("ratingRank").spectatePaging(
            success = {
                animeAdapter.submitData(it)
            })
    }

    private fun setupSubscribesPopular() {
        viewModel.fetchRatingAnime("popularityRank").spectatePaging(
            success = {
                _animeAdapter.submitData(it)
            })
    }

    private fun onItemClickListener(id: String, videoId: String) {
        findNavController().navigate(
            AnimeFragmentDirections.actionAnimeFragmentToKitsuDetailFragment(id, videoId, true, "")
        )
    }
}












