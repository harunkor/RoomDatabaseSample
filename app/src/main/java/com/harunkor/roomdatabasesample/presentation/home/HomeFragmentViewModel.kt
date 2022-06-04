package com.harunkor.roomdatabasesample.presentation.home

import androidx.lifecycle.*
import com.harunkor.roomdatabasesample.domain.model.AllTransactions
import com.harunkor.roomdatabasesample.domain.model.IncomeTable
import com.harunkor.roomdatabasesample.domain.model.OutcomeTable
import com.harunkor.roomdatabasesample.domain.repository.AllTransactionsRepository

class MainFragmentViewModel(private val allTranslationRepository: AllTransactionsRepository) :
    ViewModel() {
    val allTranslations: LiveData<List<AllTransactions>> =
        allTranslationRepository.allTranslation.asLiveData()
    val allIncomes: LiveData<List<IncomeTable>> = allTranslationRepository.allIncomes.asLiveData()
    val allOutcomes: LiveData<List<OutcomeTable>> =
        allTranslationRepository.allOutcomes.asLiveData()
}

class MainFragmentViewModelFactory(private val repository: AllTransactionsRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainFragmentViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return MainFragmentViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}