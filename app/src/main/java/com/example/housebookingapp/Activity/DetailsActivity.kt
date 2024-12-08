package com.example.housebookingapp.Activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.housebookingapp.Model.ItemDomain
import com.example.housebookingapp.R
import com.example.housebookingapp.databinding.ActivityDetailsBinding

class DetailsActivity : BaseActivity() {
    private lateinit var binding: ActivityDetailsBinding
    private lateinit var property:ItemDomain
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        GetBundles()
        SetVariable()
    }

    private fun SetVariable() {
        binding.backButton.setOnClickListener{finish()}
        val drawableResourceId=resources.getIdentifier(property.imagePath,"drawable",packageName)
        Glide.with(this@DetailsActivity)
            .load(drawableResourceId)
            .into(binding.itemImage)

        binding.title.text="${property.title} in ${property.address}"
        binding.description.text=property.description
        binding.type.text=property.type
        binding.price.text="${property.price}$"
        binding.score.text="${property.score}"
        binding.bedroom.text="${property.bed} Bedroom"
        binding.bathroom.text="${property.bath} Bathroom"
        binding.size.text = "${property.size} m\u00B2"
        binding.garage.text=if(property.isGarage)"Car Garage" else "no-Car Garage"

    }

    private fun GetBundles() {
        property=intent.getSerializableExtra("object") as ItemDomain
    }
}