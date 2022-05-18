package com.example.kitsu.presentation.ui.fragment.auth

import android.util.Log
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.base.BaseFragment
import com.example.kitsu.common.extensions.mainNavController
import com.example.kitsu.common.extensions.navigateSafely
import com.example.kitsu.databinding.FragmentSignInBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignInFragment :
    BaseFragment<FragmentSignInBinding, SignInViewModel>(R.layout.fragment_sign_in) {

    override val binding by viewBinding(FragmentSignInBinding::bind)
    override val viewModel: SignInViewModel by viewModels()


    override fun launchObservers() {
        subscribeToAuthorization()
    }

    private fun subscribeToAuthorization() {
        viewModel.signInState.spectateUiState(
            error = {
                Log.e("haha", it)
            },
            success = {
                mainNavController().navigateSafely(R.id.action_signInFlowFragment2_to_mainFlowFragment2)
                Log.e("haha", "success")


            }, gatherIfSucceed = {
                it.setupViewVisibility(binding.signInContainerd, binding.progressbar)
            })
    }

    override fun setupListeners() {
        binding.btnSignIn.setOnClickListener {
            viewModel.fetchSignIs(
                binding.etEmail.text.toString(),
                binding.etPassword.text.toString()
            )
        }
    }

}