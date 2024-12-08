package com.example.housebookingapp.Activity

import android.content.Intent
import android.os.Bundle
import com.example.housebookingapp.databinding.ActivitySplashBinding

class SplashActivity : BaseActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.startedButton.setOnClickListener {
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
        }
    }
}