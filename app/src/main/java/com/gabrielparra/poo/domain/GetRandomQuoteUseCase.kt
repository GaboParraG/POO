package com.gabrielparra.poo.domain

import com.gabrielparra.poo.data.model.QuoteModel
import com.gabrielparra.poo.data.model.QuoteProvider

class GetRandomQuoteUseCase {
    // caso de uso para refrescar las citas
    operator fun invoke(): QuoteModel?{
        val quotes = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}