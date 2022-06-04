package com.harunkor.roomdatabasesample.sleep

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class SleepRepository(private val sleepDatabaseDao: SleepDatabaseDao) {

    val allSleepNights: Flow<List<SleepNight>> = sleepDatabaseDao.getAllNights()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(sleepNight: SleepNight) {
        sleepDatabaseDao.insert(sleepNight)
    }
}