package com.gabrielparra.poo.data.network

import com.gabrielparra.poo.core.RetrofitHelper
import com.gabrielparra.poo.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


//En esta clase estan todas las llamadas a servicios
class QuoteService  {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO) {  //-> se ejecuta el llamado en un hilo aparte de principal
            val response = retrofit.create(QuoteApiClient::class.java).getAllQuotes()
            response.body() ?: emptyList()
        }
    }
}