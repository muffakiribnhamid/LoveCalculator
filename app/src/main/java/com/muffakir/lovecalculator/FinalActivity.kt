package com.muffakir.lovecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muffakir.lovecalculator.databinding.ActivityFinalBinding
import com.muffakir.lovecalculator.databinding.ActivitySecondBinding
import java.util.*

class FinalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFinalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.firstname.text = SharedPrefHelper.get_firstname(this)
        binding.secondname.text = SharedPrefHelper.get_secondname(this)

        val rand = Random()
        val randomInt = rand.nextInt(26) + 75

        binding.Details.text = "$randomInt%"

        binding.btnAgain.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        finish()
        }

    }
}