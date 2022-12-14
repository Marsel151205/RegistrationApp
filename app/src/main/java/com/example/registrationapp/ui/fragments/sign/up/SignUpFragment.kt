package com.example.registrationapp.ui.fragments.sign.up

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.registrationapp.R
import com.example.registrationapp.base.BaseFragment
import com.example.registrationapp.data.local.sharedpreferences.userdata.UserPreferencesData
import com.example.registrationapp.databinding.FragmentSignInBinding
import com.example.registrationapp.databinding.FragmentSignUpBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SignUpFragment : BaseFragment<FragmentSignUpBinding>(R.layout.fragment_sign_up) {
    override val binding by viewBinding(FragmentSignUpBinding::bind)

    @Inject
    lateinit var userPreferencesData: UserPreferencesData

    override fun setupListener() {
        binding.btnRegistration.setOnClickListener {
            userPreferencesData.isAuthorized = true
            requireActivity().findNavController(R.id.nav_host_fragment)
                .navigate(R.id.action_global_mainFlowFragment)
        }
    }
}