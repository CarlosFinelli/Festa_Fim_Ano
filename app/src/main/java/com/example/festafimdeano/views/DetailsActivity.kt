package com.example.festafimdeano.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.festafimdeano.R
import com.example.festafimdeano.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    var binding: ActivityDetailsBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        val checkBox = binding!!.checkParticipate
    }
}