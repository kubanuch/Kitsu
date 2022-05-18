package com.example.kitsu.presentation.ui.fragment.main.manga

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.base.BaseFragment
import com.example.kitsu.databinding.FragmentMangaBinding
import com.example.kitsu.presentation.ui.adapters.MangaAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MangaFragment : BaseFragment<FragmentMangaBinding, MangaViewModel>(
    R.layout.fragment_manga
) {
    override val binding by viewBinding(FragmentMangaBinding::bind)
    override val viewModel: MangaViewModel by viewModels()
    private val mangaAdapter = MangaAdapter(this::onItemClickListener)
    private val _mangaAdapter = MangaAdapter(this::onItemClickListener)


    override fun setupViews() {
        setupAdapter()
    }

    private fun setupAdapter() {
        binding.recyclerviewManga.adapter = mangaAdapter
        binding.recyclerviewPopularManga.adapter = _mangaAdapter
    }


    override fun launchObservers() {
        setupSubscribesRating()
        setupSubscribesPopular()
    }

    private fun setupSubscribesRating() {
        viewModel.fetchRatingManga("ratingRank").spectatePaging(
            success = {
                mangaAdapter.submitData(it)
            })
    }

    private fun setupSubscribesPopular() {
        viewModel.fetchPopularManga("ageRatingGuide").spectatePaging(
            success = {
                _mangaAdapter.submitData(it)
                Log.e("hehe", it.toString())
            })
    }

    private fun onItemClickListener(id: String) {
        findNavController().navigate(
            MangaFragmentDirections.actionMangaFragmentToKitsuDetailFragment("", "", false, id)
        )
    }

}