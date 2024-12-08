package com.example.housebookingapp.Model

import java.io.Serializable

data class ItemDomain(
    var type:String,
    var title:String,
    var address:String,
    var imagePath:String,
    var description:String,
    var price:Int,
    var bed:Int,
    var bath:Int,
    var size:Int,
    var isGarage:Boolean,
    var score:Double
):Serializable
