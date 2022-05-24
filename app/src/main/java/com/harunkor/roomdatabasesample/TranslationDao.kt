package com.harunkor.roomdatabasesample

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface TranslationDao {
    @Query(value = "SELECT * FROM all_translation_table ORDER BY traslationId ASC")
    fun readAllData(): LiveData<AllTranslation>

    @Query(value = "SELECT * FROM income_table ORDER BY incomeId ASC")
    fun readIncomeData(): LiveData<IncomeTable>

    @Query(value = "SELECT * FROM outcome_table ORDER BY outcomeId ASC")
    fun readOutcomeData(): LiveData<OutcomeTable>
}