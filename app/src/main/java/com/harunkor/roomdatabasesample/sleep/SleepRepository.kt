package com.harunkor.roomdatabasesample.sleep

import androidx.annotation.WorkerThread
import com.harunkor.roomdatabasesample.sleep.SleepDatabaseDao
import com.harunkor.roomdatabasesample.sleep.SleepNight
import kotlinx.coroutines.flow.Flow

class SleepRepository(private val sleepDatabaseDao: SleepDatabaseDao) {

    val allSleepNights : Flow<List<SleepNight>> = sleepDatabaseDao.getAllNights()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(sleepNight: SleepNight) {
        sleepDatabaseDao.insert(sleepNight)
    }

}