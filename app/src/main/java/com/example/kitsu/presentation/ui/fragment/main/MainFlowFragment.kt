package com.example.kitsu.presentation.ui.fragment.main

import android.view.View
import androidx.navigation.NavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.base.BaseFlowFragment
import com.example.kitsu.databinding.FragmentMainFlowBinding
import com.google.android.material.tabs.TabLayout


class MainFlowFragment :
    BaseFlowFragment(R.layout.fragment_main_flow, R.id.nav_main_host_fragment) {

    private val binding by viewBinding(FragmentMainFlowBinding::bind)

    override fun setupNavigation(navController: NavController) {
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                when (tab.position) {
                    0 -> navController.navigate(R.id.animeFragment)
                    1 -> navController.navigate(R.id.mangaFragment)
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.kitsuDetailFragment -> {
                    binding.tabLayout.visibility = View.GONE
                }
                R.id.animeFragment ->{
                    binding.tabLayout.visibility = View.VISIBLE
                }
                R.id.mangaFragment ->{
                    binding.tabLayout.visibility = View.VISIBLE
                }
            }
        }
    }
    }