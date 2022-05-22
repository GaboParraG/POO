package com.gabrielparra.poo.data.model

class QuoteProvider {


    companion object {
        //Se almacena en memoria la respuesta de retrofit
        var quotes: List<QuoteModel> = emptyList()
    }
}