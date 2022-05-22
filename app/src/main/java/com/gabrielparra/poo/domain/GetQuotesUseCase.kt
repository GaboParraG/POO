package com.gabrielparra.poo.domain

import com.gabrielparra.poo.data.QuoteRepository
import com.gabrielparra.poo.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    //invoke devuelve funcion especifica cuando se instancie la clase
    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()

}