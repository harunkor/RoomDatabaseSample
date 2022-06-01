package com.harunkor.roomdatabasesample

import androidx.lifecycle.*
import com.harunkor.roomdatabasesample.domain.model.AllTransactions
import com.harunkor.roomdatabasesample.domain.model.IncomeTable
import com.harunkor.roomdatabasesample.domain.model.OutcomeTable
import com.harunkor.roomdatabasesample.domain.repository.AllTransactionsRepository
import kotlinx.coroutines.launch

class MainViewModel(private val allTranslationRepository: AllTransactionsRepository) : ViewModel() {

    val allTranslations : LiveData<List<AllTransactions>> = allTranslationRepository.allTranslation.asLiveData()
    val allIncomes : LiveData<List<IncomeTable>> = allTranslationRepository.allIncomes.asLiveData()
    val allOutcomes : LiveData<List<OutcomeTable>> = allTranslationRepository.allOutcomes.asLiveData()

    fun insertAllTranslation(allTranslation: AllTransactions) = viewModelScope.launch {
        allTranslationRepository.insertAllTranslation(allTranslation)
    }

    fun insertIncome(income: IncomeTable) = viewModelScope.launch {
        allTranslationRepository.insertIncome(income)
    }

    fun insertOutcome(outcome: OutcomeTable) = viewModelScope.launch {
        allTranslationRepository.insertOutcome(outcome)
    }


}

class AllTranslationViewModelFactory(private val repository: AllTransactionsRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return MainViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}