package com.example.databindingproject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.databindingproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val user= User("Suffian", "21", "suffian@example.com")
    var count=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(binding.root)
        binding.user=user
        binding.updateButton.setOnClickListener(){
            if(count<0){
                count++
            }
            else{
                for( i in 1 until 10+count){
                    binding.user=User("Suffian"+i, "21"+i, "suffian"+i+"@example.com")
                    count++
                }
            }
        }
    }
}