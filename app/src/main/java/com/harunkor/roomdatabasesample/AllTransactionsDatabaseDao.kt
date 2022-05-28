package com.harunkor.roomdatabasesample

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface AllTransactionsDatabaseDao {

    @Insert
    suspend fun insertAllTranslation(allTranslation: AllTransactions)

    @Insert
    suspend fun insertIncome(income: IncomeTable)

    @Insert
    suspend fun insertOutcome(outcome: OutcomeTable)

    @Query("SELECT * FROM all_transactions_table ORDER BY all_transactions_id  DESC ")
    fun getAllTranslation() : Flow<List<AllTransactions>>

    @Query("SELECT * FROM income_table ORDER BY income_id DESC ")
    fun getIncomes() : Flow<List<IncomeTable>>

    @Query("SELECT * FROM outcome_table ORDER BY outcome_id DESC ")
    fun getOutcomes() : Flow<List<OutcomeTable>>

}