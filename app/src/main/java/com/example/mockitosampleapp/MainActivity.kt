package com.example.mockitosampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mockitosampleapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var activityBind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityBind=DataBindingUtil.setContentView(this, R.layout.activity_main)



        val viewMoedl = ViewModelProvider(this).get(MainViewMoedl::class.java)

       activityBind.mainViewModel=viewMoedl
        activityBind.lifecycleOwner =this

        viewMoedl.textupdate.value = "helllooo world"
        viewMoedl.btntext.value = "Start test"
    }
}