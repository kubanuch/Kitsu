package com.example.kitsu.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.viewbinding.ViewBinding
import com.example.kitsu.presentation.ui.state.UIState
import com.google.android.material.progressindicator.CircularProgressIndicator
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

abstract class BaseFragment<B : ViewBinding, V : BaseViewModel>(
    @LayoutRes layoutId: Int,
) : Fragment(layoutId) {

    protected abstract val binding: B
    protected abstract val viewModel: V

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupViews()
        setupListeners()
        setupRequests()
        setupSubscribes()
    }

    protected open fun initialize() {}

     protected open fun setupViews(){}

    protected open fun setupListeners() {}

    protected open fun setupRequests() {}

    protected open fun setupSubscribes() {}

    protected fun <T> StateFlow<UIState<T>>.collectUIState(
        lifecycleSate: Lifecycle.State = Lifecycle.State.STARTED,
        success: ((data: T) -> Unit)? = null,
        loading: ((data: UIState.Loading<T>) -> Unit)? = null,
        error: ((error: String) -> Unit)? = null,
        idle: ((idle: UIState.Idle<T>) -> Unit)? = null,
        doSomethingInCollect: ((state: UIState<T>) -> Unit)? = null,
    ) {
        collectFlowSafely(lifecycleSate) {
           collect {
                doSomethingInCollect?.invoke(it)
               when (it) {
                   is UIState.Idle -> {
                       idle?.invoke(it)
                   }
                   is UIState.Loading -> {
                       loading?.invoke(it)
                   }
                   is UIState.Error -> {
                       error?.invoke(it.error)
                   }
                   is UIState.Success -> {
                       success?.invoke(it.data)
                   }
                }
            }
        }

    }

    private fun collectFlowSafely(
        lifecycleSate: Lifecycle.State,
        collect: suspend () -> Unit
    ) {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(lifecycleSate){
                collect()
            }
        }
    }

    protected fun <T> UIState<T>.setupViewVisibility(
        group: androidx.constraintlayout.widget.Group, loader: CircularProgressIndicator, isNavigateWhenSuccess: Boolean = false
    ) {
        fun showLoader(isVisible: Boolean) {
            group.isVisible = !isVisible
            loader.isVisible = isVisible
        }
        when (this) {
            is UIState.Idle -> {
            }
            is UIState.Loading -> {
                showLoader(true)
            }

            is UIState.Error -> {
                showLoader(false)
            }
            is UIState.Success -> if (isNavigateWhenSuccess) {
                showLoader(true)
            } else{
                showLoader(false)
            }
        }
    }
}