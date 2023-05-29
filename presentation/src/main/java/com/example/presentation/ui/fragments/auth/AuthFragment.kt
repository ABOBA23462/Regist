package com.example.presentation.ui.fragments.auth

import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.presentation.R
import com.example.presentation.base.BaseFragment
import com.example.presentation.databinding.FragmentAuthBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

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

                viewLifecycleOwner.lifecycleScope.launch {
                    delay(2000)
                    viewModel.getUser().apply {
                        binding.etLogin.setText(this.name)
                        binding.etAge.setText(this.age)
                        binding.etPassword.setText(this.password)
                    }
                }
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