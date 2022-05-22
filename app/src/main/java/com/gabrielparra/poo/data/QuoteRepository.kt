package com.gabrielparra.poo.data

import com.gabrielparra.poo.data.model.QuoteModel
import com.gabrielparra.poo.data.model.QuoteProvider
import com.gabrielparra.poo.data.network.QuoteService

//Clase encargada de gestionar de donde trae la data si de local o de network
class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel>{
        val response:List<QuoteModel> = api.getQuotes()
        QuoteProvider.quotes = response
        return response

    }
}