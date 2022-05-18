package com.example.kitsu.presentation.ui.fragment.main.detail

import android.content.Intent
import android.net.Uri
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.base.BaseFragment
import com.example.kitsu.common.extensions.setImage
import com.example.kitsu.databinding.FragmentAnimeDetailBinding
import com.example.kitsu.presentation.ui.adapters.GenresAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class KitsuDetailFragment : BaseFragment<FragmentAnimeDetailBinding, KitsuDetailViewModel>(
    R.layout.fragment_anime_detail
) {
    override val viewModel: KitsuDetailViewModel by viewModels()
    override val binding by viewBinding(FragmentAnimeDetailBinding::bind)
    private val genresAdapter = GenresAdapter()
    private val args: KitsuDetailFragmentArgs by navArgs()


    override fun launchObservers() {
        setupGenresAdapter()
        getData()
        subscribeToGenres()
    }
    override fun setupRequests() {
        if (args.isAnime) {
            viewModel.fetchAnimeId(args.animeId)
            viewModel.fetchGenres(args.id)
        } else {
            viewModel.fetchMangaId(args.id)
        }

    }



    private fun setupGenresAdapter() {
        binding.recyclerview.adapter = genresAdapter
    }

    private fun subscribeToGenres() {
        if (args.isAnime) {
            viewModel.detailStateGenres.spectateUiState(
                error = {},
                success = {
                    genresAdapter.submitList(it.data)
                })
        } else {
            viewModel.detailStateGenres.spectateUiState(
                error = {},
                success = {
                    genresAdapter.submitList(it.data)
                })
        }
    }



    private fun getData() {
        if (args.isAnime) {
            viewLifecycleOwner.lifecycleScope.launch {
                viewModel.detailState.spectateUiState(
                    error = {
                        Log.e("anime", it)
                        Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
                    },
                    success = {
                        it.data.let { anime ->
                            Log.e("anime", anime.attributes?.posterImage?.original.toString())
                            binding.imPoster.setImage(anime.attributes?.posterImage?.original)
                            binding.ivCover.setImage(anime.attributes?.coverImage?.original)
                            binding.imRating.setImage(anime.attributes?.averageRating)
                            binding.tvSynopsis.text = (anime.attributes?.description)
                            binding.tvTitle.text = (anime.attributes?.titles?.en)
                            binding.btnYoutubeVideo.visibility = View.VISIBLE
                        }
                    }
                )
            }
        } else {
            viewLifecycleOwner.lifecycleScope.launch {
                viewModel.detailStateManga.spectateUiState(
                    error = {
                        Log.e("manga", it)
                    },
                    success = {
                        it.data.let { manga ->
                            Log.e("manga", manga.attributes?.posterImage?.original.toString())
                            binding.imPoster.setImage(manga.attributes?.posterImage?.original)
                            binding.ivCover.setImage(manga.attributes?.posterImage?.original)
                            binding.tvTitle.text = (manga.attributes?.titles?.en)
                            binding.tvSynopsis.text = (manga.attributes?.description)
                            binding.btnYoutubeVideo.visibility = View.VISIBLE

                        }
                    }
                )

            }
        }

    }


    override fun setupListeners() {
        openVideo()
    }

    private fun openVideo() {
        if (args.isAnime) {
            binding.btnYoutubeVideo.setOnClickListener {
                this.startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("vnd.youtube:${args.videoId}")
                    )
                )
            }
        } else {
            binding.btnYoutubeVideo.setOnClickListener {
                this.startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("vnd.youtube:${args.videoId}")
                    )
                )
            }
        }
    }
}
