package com.harunkor.roomdatabasesample

import android.app.Application
import com.harunkor.roomdatabasesample.data.remote.AllTransactionsDatabase
import com.harunkor.roomdatabasesample.domain.repository.AllTransactionsRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class AllTransactionsApplication : Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

    val database by lazy { AllTransactionsDatabase.getInstance(this, applicationScope) }

    val repository by lazy { AllTransactionsRepository(database.allTranslationDatabaseDao()) }

}