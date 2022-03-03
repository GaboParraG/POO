package com.gabrielparra.poo.data.network

import com.gabrielparra.poo.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET



interface QuoteApiClient {
    @GET("/.json")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>

}