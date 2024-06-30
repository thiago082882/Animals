package com.thiago.animals.data

import androidx.annotation.DrawableRes

data class Animals(
    val name:String,
    val gender:String,
    val age:String,
    val breed:String,
    val color:String,
    val location:String,
    @DrawableRes val image:Int,
    val description:String,
    val id:Int
)