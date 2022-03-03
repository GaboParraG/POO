package com.gabrielparra.poo.domain

import com.gabrielparra.poo.data.QuoteRepository
import com.gabrielparra.poo.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>?{
        return repository.getAllQuotes()
    }
}