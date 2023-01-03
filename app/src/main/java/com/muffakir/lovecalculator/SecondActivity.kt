package com.muffakir.lovecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.muffakir.lovecalculator.databinding.ActivityMainBinding
import com.muffakir.lovecalculator.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.next.setOnClickListener {
            val firstname = binding.personFirst.text.toString()
            val secondname = binding.personSecond.text.toString()

            SharedPrefHelper.savefirst_name(this,firstname)
            SharedPrefHelper.savesecond_name(this,secondname)

            if (firstname.isEmpty() || secondname.isEmpty()){
                Toast.makeText(this,"Enter A Name",Toast.LENGTH_SHORT).show()
            }
            else if (firstname.isNotEmpty() || secondname.isNotEmpty()) {

                val intent1 = Intent(this,FinalActivity::class.java)
                startActivity(intent1)
                finish()
            }



        }



        }


    }

