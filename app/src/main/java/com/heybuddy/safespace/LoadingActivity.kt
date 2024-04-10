package com.heybuddy.safespace

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.heybuddy.safespace.databinding.ActivityLoadingBinding
import com.heybuddy.safespace.databinding.ActivityMainBinding

class LoadingActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind = ActivityLoadingBinding.inflate(layoutInflater)
        setContentView(bind.root)

        val handler = Handler()
        handler.postDelayed({
            val i = Intent(this, LoginActivity::class.java)
            startActivity(i)
            finish()
        }, 1500)
    }
}