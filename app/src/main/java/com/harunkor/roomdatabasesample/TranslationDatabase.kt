package com.harunkor.roomdatabasesample

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [AllTranslation::class], version = 1, exportSchema = false)
public abstract class AllTraslationRoomDatabase : RoomDatabase() {

    abstract fun allTranslationDao(): AllTranslation

    companion object {
        @Volatile
        private var INSTANCE: AllTraslationRoomDatabase? = null

        fun getDatabase(context: Context): AllTraslationRoomDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AllTraslationRoomDatabase::class.java,
                    "all_translation_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}