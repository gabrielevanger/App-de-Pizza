package com.example.appdepizzaria

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.appdepizzaria.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var clicked = false

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#E0E0E0")

       CoroutineScope(Dispatchers.IO).launch {

       }

        binding.btAll.setOnClickListener{
            clicked = true
            if(clicked) {
                binding.btAll.setBackgroundResource(R.drawable.bg_button_enabled)
                binding.btAll.setTextColor(Color.WHITE)
                binding.btChicken.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btChicken.setTextColor(R.color.dark_gray)
                binding.btKebab.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btKebab.setTextColor(R.color.dark_gray)
                binding.btPizza.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btPizza.setTextColor(R.color.dark_gray)
                binding.recyclerViewProducts.visibility = View.INVISIBLE
                binding.txtListTitle.text = "All"
            }
        }

        binding.btChicken.setOnClickListener{
            clicked = true
            if(clicked) {
                binding.btChicken.setBackgroundResource(R.drawable.bg_button_enabled)
                binding.btChicken.setTextColor(Color.WHITE)
                binding.btAll.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btAll.setTextColor(R.color.dark_gray)
                binding.btKebab.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btKebab.setTextColor(R.color.dark_gray)
                binding.btPizza.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btPizza.setTextColor(R.color.dark_gray)
                binding.recyclerViewProducts.visibility = View.INVISIBLE
                binding.txtListTitle.text = "Chicken"
            }
        }

        binding.btPizza.setOnClickListener{
            clicked = true
            if(clicked) {
                binding.btPizza.setBackgroundResource(R.drawable.bg_button_enabled)
                binding.btPizza.setTextColor(Color.WHITE)
                binding.btAll.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btAll.setTextColor(R.color.dark_gray)
                binding.btChicken.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btChicken.setTextColor(R.color.dark_gray)
                binding.btKebab.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btKebab.setTextColor(R.color.dark_gray)
                binding.recyclerViewProducts.visibility = View.VISIBLE
                binding.txtListTitle.text = "Popular Pizza"
            }
        }

        binding.btKebab.setOnClickListener{
            clicked = true
            if(clicked) {
                binding.btKebab.setBackgroundResource(R.drawable.bg_button_enabled)
                binding.btKebab.setTextColor(Color.WHITE)
                binding.btPizza.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btPizza.setTextColor(R.color.dark_gray)
                binding.btAll.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btAll.setTextColor(R.color.dark_gray)
                binding.btChicken.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btChicken.setTextColor(R.color.dark_gray)
                binding.recyclerViewProducts.visibility = View.INVISIBLE
                binding.txtListTitle.text = "Kebab"
            }
        }


        }
    }