package com.example.mockitosampleapp

import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


open class LoginViewModel :ViewModel() {

    var username= MutableLiveData<String>()
    var pass= MutableLiveData<String>()
  var edittext= MutableLiveData<String>()
    var status= MutableLiveData<String>()

    fun updateUserName(v: View)
    {
        loginUser()
    }

    fun loginUser(){

        logUser(username.value.toString(), pass.value.toString())
    }

    fun logUser(user: String, pass: String)
    {
        if(pass.equals("") || username.equals("")) {
            Log.v(TAG.TAG, "Fill the fields")
        }
        else {
            Log.v(TAG.TAG, "logged")

        }

    }

    object TAG {
        val TAG ="LoginViewModel"
    }

    val textWatcher : TextWatcher = object : TextWatcher{
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            Log.v("TEXXTXTX", s.toString())
            username.value=s.toString()

        }

        override fun afterTextChanged(s: Editable?) {

        }
    }


    val textPaaWatcher : TextWatcher = object : TextWatcher{
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            Log.v("TEXXTXTX", s.toString())
            pass.value=s.toString()

        }

        override fun afterTextChanged(s: Editable?) {

        }
    }

}