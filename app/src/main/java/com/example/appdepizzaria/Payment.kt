package com.example.appdepizzaria

import android.content.Intent
import android.graphics.Color
import android.icu.text.DecimalFormat
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appdepizzaria.databinding.ActivityPaymentBinding
import com.example.appdepizzaria.databinding.ActivityProductDetailsBinding

class Payment : AppCompatActivity() {

    private lateinit var binding: ActivityPaymentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //color StatusBar
        window.statusBarColor = Color.parseColor("#E0E0E0")

        val name = intent.extras!!.getString("name")
        val amount = intent.extras!!.getInt("amount")
        val total = intent.extras!!.getDouble("total")
        val saucesAndDrinks = intent.extras!!.getString("saucesAndDrinks")
        val decimalFormat = DecimalFormat.getCurrencyInstance()

        binding.txtTotal.text = "$name \n Amount: $amount \n Sauces And Drinks: $saucesAndDrinks \n Total: ${decimalFormat.format(total
        )}"

        binding.btPay.setOnClickListener {
            if (binding.btCreditCard.isChecked){
                val intent = Intent(this, ThankYouScreen::class.java)
                startActivity(intent)
                Toast.makeText(this, "Card Payment", Toast.LENGTH_SHORT).show()
            }else if(binding.btPix.isChecked){
                binding.editPix.visibility = View.VISIBLE
                val pix = binding.editPix.text.toString()

                if(pix.isEmpty()){
                    val intent = Intent(this, ThankYouScreen::class.java)
                    intent.putExtra("usePix", pix)
                    startActivity(intent)
                    Toast.makeText(this, "Payment with Pix", Toast.LENGTH_SHORT).show()
                }else {
                    Toast.makeText(this, "Fill in the pix field", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}