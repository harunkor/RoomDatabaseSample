package com.harunkor.roomdatabasesample.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.harunkor.roomdatabasesample.data.remote.AllTransactionsDatabaseDao
import com.harunkor.roomdatabasesample.domain.model.AllTransactions
import com.harunkor.roomdatabasesample.domain.model.IncomeTable
import com.harunkor.roomdatabasesample.domain.model.OutcomeTable
import kotlinx.coroutines.CoroutineScope

@Database(entities = [AllTransactions::class, IncomeTable::class, OutcomeTable::class], version = 1)
abstract class AllTransactionsDatabase : RoomDatabase() {

    abstract fun allTranslationDatabaseDao(): AllTransactionsDatabaseDao

    companion object {
        @Volatile
        private var INSTANCE: AllTransactionsDatabase? = null

        fun getInstance(context: Context, scope: CoroutineScope): AllTransactionsDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        AllTransactionsDatabase::class.java,
                        "all_translation_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance

                }
                return instance
            }
        }
    }
}