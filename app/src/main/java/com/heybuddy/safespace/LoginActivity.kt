package com.heybuddy.safespace

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.heybuddy.safespace.databinding.ActivityLoginBinding

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.spaceAuthBtn.setOnClickListener{
            val i = Intent(this, MovieListActivity::class.java)
            startActivity(i)
        }
    }
}