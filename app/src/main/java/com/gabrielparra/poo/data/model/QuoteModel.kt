package com.gabrielparra.poo.data.model

import com.google.gson.annotations.SerializedName


//Modelo de respuesta de retrofit
data class QuoteModel(
    @SerializedName("quote") val quote:String,
    @SerializedName("author") val author:String
    )
