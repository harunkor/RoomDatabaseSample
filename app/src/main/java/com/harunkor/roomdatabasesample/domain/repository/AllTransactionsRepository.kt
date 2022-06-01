package com.harunkor.roomdatabasesample.domain.repository

import androidx.annotation.WorkerThread
import com.harunkor.roomdatabasesample.data.remote.AllTransactionsDatabaseDao
import com.harunkor.roomdatabasesample.domain.model.AllTransactions
import com.harunkor.roomdatabasesample.domain.model.IncomeTable
import com.harunkor.roomdatabasesample.domain.model.OutcomeTable
import kotlinx.coroutines.flow.Flow

class AllTransactionsRepository(private val allTranslationDatabaseDao: AllTransactionsDatabaseDao) {

    val allTranslation : Flow<List<AllTransactions>> = allTranslationDatabaseDao.getAllTranslation()
    val allIncomes : Flow<List<IncomeTable>> = allTranslationDatabaseDao.getIncomes()
    val allOutcomes : Flow<List<OutcomeTable>> = allTranslationDatabaseDao.getOutcomes()



    @WorkerThread
    suspend fun insertAllTranslation(allTranslation: AllTransactions) {
        allTranslationDatabaseDao.insertAllTranslation(allTranslation)
    }

    @WorkerThread
    suspend fun insertIncome(income: IncomeTable) {
        allTranslationDatabaseDao.insertIncome(income)
    }

    @WorkerThread
    suspend fun insertOutcome(outcome: OutcomeTable) {
        allTranslationDatabaseDao.insertOutcome(outcome)
    }

}