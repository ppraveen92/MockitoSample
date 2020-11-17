package com.example.mockitosampleapp

import android.view.View
import android.widget.Toast
import org.junit.Before
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Test
import org.junit.rules.Verifier
import org.mockito.Mock

@RunWith(MockitoJUnitRunner::class)
class LoginViewModelTest {



    @Mock
    lateinit var loginViewModel: LoginViewModel
    val rule = InstantTaskExecutorRule()



    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        loginViewModel = LoginViewModel()


    }


    @Test
    fun loginTest(){
        loginViewModel.logUser("prav","varp")
        Mockito.verify(loginViewModel).logUser("prav","varp")
    }




}