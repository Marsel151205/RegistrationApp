package com.example.registrationapp.ui.fragments.main.home

import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.registrationapp.R
import com.example.registrationapp.base.BaseFragment
import com.example.registrationapp.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {

    override val binding by viewBinding(FragmentHomeBinding::bind)

}