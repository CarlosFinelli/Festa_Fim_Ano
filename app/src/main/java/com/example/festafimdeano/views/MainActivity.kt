package com.example.festafimdeano.views

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.festafimdeano.R
import com.example.festafimdeano.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null
    @SuppressLint("SimpleDateFormat")
    private val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        val textToday = binding!!.textToday
        val textDaysLeft = binding!!.textDayLeft
        val buttonConfirm = binding!!.btnConfirm

        textToday.text = simpleDateFormat.format(Calendar.getInstance().time)
        textDaysLeft.text = String.format("%s %s", getDaysLeft().toString(), getString(R.string.dias))

        buttonConfirm.setOnClickListener {
            startActivity(Intent(baseContext, DetailsActivity::class.java))
        }


    }

    fun getDaysLeft() : Int {
        val calendarToday = Calendar.getInstance()
        val today = calendarToday.get(Calendar.DAY_OF_YEAR)

        val calendarLastDay = Calendar.getInstance()
        val dayMax = calendarLastDay.getActualMaximum(Calendar.DAY_OF_YEAR)

        return dayMax - today
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}