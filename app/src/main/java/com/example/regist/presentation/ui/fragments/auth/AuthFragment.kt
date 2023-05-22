package com.example.regist.presentation.ui.fragments.auth

import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.regist.R
import com.example.regist.databinding.FragmentAuthBinding
import com.example.regist.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthFragment :
    BaseFragment<FragmentAuthBinding, AuthViewModel>(R.layout.fragment_auth) {

    override val binding by viewBinding(FragmentAuthBinding::bind)
    override val viewModel: AuthViewModel by viewModels()

    override fun setupRequests() = with(binding) {
        btnLogin.setOnClickListener {
            if (etLogin.text.isNullOrEmpty() || etPassword.text.isNullOrEmpty() || etAge.text.isNullOrEmpty()) {
                Toast.makeText(context, "Введите свои данные", Toast.LENGTH_SHORT).show()
            } else {
                val login = binding.etLogin.text.toString().trim()
                val password = etPassword.text.toString().trim()
                val age = etAge.text.toString().trim().toInt()
                viewModel.authUser(login, password, age)
                findNavController().navigate(
                    AuthFragmentDirections.actionAuthFragmentToHomeFragment(
                        login,
                        password, age
                    )
                )
            }
        }
    }
}