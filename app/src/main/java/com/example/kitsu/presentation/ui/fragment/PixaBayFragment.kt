package com.example.kitsu.presentation.ui.fragment

import android.util.Log
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.base.BaseFragment
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentHeroesBinding
import com.example.kitsu.presentation.ui.adapters.PixaBayAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PixaBayFragment : BaseFragment<FragmentHeroesBinding, PixaBayViewModel>(
    R.layout.fragment_heroes
) {
    override val viewModel: PixaBayViewModel by viewModels()
    override val binding by viewBinding(FragmentHeroesBinding::bind)
    private val pixaBayAdapter = PixaBayAdapter()

    override fun setupViews() {
        setupAdapter()
    }

    private fun setupAdapter() = with(binding.recyclerview) {
        binding.recyclerview.apply {
            adapter = pixaBayAdapter
        }
    }


    override fun setupSubscribes() {
        viewModel.heroesState.collectUIState(
            error = {
                Log.e("error", it)
            },
            success = {
                Log.e("success", it.toString())
                pixaBayAdapter.submitList(it)
            })
    }


}



