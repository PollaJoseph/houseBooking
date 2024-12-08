package com.example.housebookingapp.Activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.housebookingapp.Adapter.ItemAdapter
import com.example.housebookingapp.Model.ItemDomain
import com.example.housebookingapp.R
import com.example.housebookingapp.databinding.ActivityMainBinding
import com.example.housebookingapp.databinding.ViewHolderItemBinding

class MainActivity : BaseActivity() {
        private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        InitList()
    }

    private fun InitList() {
        val items= arrayListOf(
            ItemDomain(
                type = "Apartment",
                title = "Royal Apartment",
                address = "LosAngeles LA",
                imagePath = "item_1",
                description = "The Royal Apartment is a luxurious and modern living space located in the heart of Los Angeles. Featuring 3 spacious bedrooms, 2 elegant bathrooms, and a contemporary open-plan design, this apartment offers a perfect blend of comfort and style. The large windows allow natural light to fill the space, creating a warm and inviting atmosphere. It's the ideal choice for families or professionals looking for a premium living experience.",
                price = 1500,
                bed = 3,
                bath = 2,
                size = 350,
                isGarage = false,
                score = 4.5
            ),
            ItemDomain(
                type = "House",
                title = "Oceanview House",
                address = "Miami Beach",
                imagePath = "item_2",
                description = "Nestled in the vibrant Miami Beach area, the Oceanview Condo boasts breathtaking views of the ocean and the city skyline. This luxury condo features 4 large bedrooms, 3 modern bathrooms, and a sleek kitchen fitted with state-of-the-art appliances. With a private balcony and access to exclusive amenities like a swimming pool and fitness center, it’s the perfect place to unwind and enjoy coastal living.",
                price = 2000,
                bed = 4,
                bath = 3,
                size = 400,
                isGarage = true,
                score = 4.8
            ),
            ItemDomain(
                type = "Villa",
                title = "Sunset Villa",
                address = "Malibu Hills",
                imagePath = "item_3",
                description = "Sunset Villa is a dream come true for those seeking tranquility and luxury in the serene Malibu Hills. This stunning property offers 5 expansive bedrooms, 4 lavish bathrooms, and a sprawling living area that opens to a private patio and infinity pool. Surrounded by lush greenery and offering panoramic views of the ocean, the villa is designed to provide an unmatched living experience for families and guests alike.",
                price = 3500,
                bed = 5,
                bath = 4,
                size = 550,
                isGarage = true,
                score = 4.9
            ),
            ItemDomain(
                type = "House",
                title = "Downtown House",
                address = "New York NY",
                imagePath = "item_4",
                description = "Located in the bustling heart of New York City, the Downtown Studio is a compact yet stylish space perfect for urban living. Designed with functionality in mind, this studio features 1 cozy bedroom, a modern bathroom, and a minimalist kitchen. Its prime location offers easy access to the city's top attractions, restaurants, and business hubs, making it an excellent choice for young professionals or solo adventurers.",
                price = 1200,
                bed = 1,
                bath = 1,
                size = 150,
                isGarage = false,
                score = 4.3
            )
        )
        binding.recyclerView.layoutManager=
            LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.recyclerView.adapter=ItemAdapter(items)
        binding.navBar.setItemSelected(0,true)
    }
}