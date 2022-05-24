package com.harunkor.roomdatabasesample

import androidx.lifecycle.LiveData
import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
public interface TranslationDao {

    @Insert
    suspend fun insert(translation: AllTranslation)

    @Update
    fun update(translation: AllTranslation)

    @Delete
    fun delete(translation: AllTranslation)

    @Query( "DELETE FROM all_translation_table")
    suspend fun clear()

    @Query(value = "SELECT * FROM all_translation_table ORDER BY traslationId ASC")
    fun readAllData(translation: AllTranslation): Flow<List<AllTranslation>>

    @Query(value = "SELECT * FROM income_table ORDER BY incomeId ASC")
    fun readIncomeData():Flow<List<IncomeTable>>


    @Query(value = "SELECT * FROM outcome_table ORDER BY outcomeId ASC")
    fun readOutcomeData(): Flow<List<OutcomeTable>>
}