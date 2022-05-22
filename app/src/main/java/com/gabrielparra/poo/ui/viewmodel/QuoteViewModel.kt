package com.gabrielparra.poo.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gabrielparra.poo.data.model.QuoteModel
import com.gabrielparra.poo.data.model.QuoteProvider
import com.gabrielparra.poo.domain.GetQuotesUseCase
import com.gabrielparra.poo.domain.GetRandomQuoteUseCase
import kotlinx.coroutines.launch

class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()
    val isLoading = MutableLiveData<Boolean>()

    var getQuotesUseCase = GetQuotesUseCase()
    var getRandomQuoteUseCase = GetRandomQuoteUseCase()

    fun onCreate(){
        // Llamada al caso de uso
        viewModelScope.launch {  //-> viewModelScope nos permite crear una corrutina propia para viewmodel
            isLoading.postValue(true)
            val result:List<QuoteModel>? = getQuotesUseCase()
            if (!result.isNullOrEmpty()){
                quoteModel.postValue(result[0])
                isLoading.postValue(false)

            }
        }
    }

    fun randomQuote() {
        isLoading.postValue(true)
        val quote = getRandomQuoteUseCase() // llamado al caso de uso para cliquear las citas
        if(quote!=null){
            quoteModel.postValue(quote)
        }
        isLoading.postValue(false)
    }
}