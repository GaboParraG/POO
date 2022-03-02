package com.gabrielparra.poo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gabrielparra.poo.model.QuoteModel
import com.gabrielparra.poo.model.QuoteProvider

class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)  //Se cambia el valor inicial por el que tre la funcion random()
    }
}