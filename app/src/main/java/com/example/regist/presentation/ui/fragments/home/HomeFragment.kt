package com.example.regist.presentation.ui.fragments.home

import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.regist.R
import com.example.regist.databinding.FragmentAuthBinding
import com.example.regist.databinding.FragmentHomeBinding
import com.example.regist.presentation.base.BaseFragment
import com.example.regist.presentation.ui.fragments.auth.AuthViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment :
    BaseFragment<FragmentHomeBinding, HomeViewModel>(R.layout.fragment_home) {

    override val binding by viewBinding(FragmentHomeBinding::bind)
    override val viewModel: HomeViewModel by viewModels()
    private val args by navArgs<HomeFragmentArgs>()

    override fun setupRequests() {
        binding.btnDet.setOnClickListener {
            binding.cvDet.isVisible = true
            binding.btnDet.isVisible = false
            setupSubscribes()
        }
    }

    override fun setupSubscribes() {
        viewModel.getUser().apply {
            val name = args.login
            val password = args.password
            val age = args.age
                binding.tvDetLog.text = name
                    binding.tvDetPass.text = password
                        binding.tvDetAge.text = age.toString()
        }
    }
}