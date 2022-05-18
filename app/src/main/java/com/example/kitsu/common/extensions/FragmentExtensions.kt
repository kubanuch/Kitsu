package com.example.kitsu.common.extensions

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.findNavController
import com.example.kitsu.R


fun Fragment.mainNavController() = requireActivity().findNavController(R.id.nav_host_fragment)


fun NavController.navigateSafely(@IdRes actionId: Int) =
    currentDestination?.getAction(actionId)?.let { navigate(actionId) }

fun NavController.navigateSafelyUsingDirections(directions: NavDirections) =
    currentDestination?.getAction(directions.actionId)?.let { navigate(directions) }