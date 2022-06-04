package com.harunkor.roomdatabasesample.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "all_transactions_table")
data class AllTransactions(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "all_transactions_id")
    var incomeId: Int = 0,

    @ColumnInfo(name = "all_transactions_logo")
    val companyLogo: Int = 0,

    @ColumnInfo(name = "all_transactions_title")
    val allTransactionsTitle: String = "",

    @ColumnInfo(name = "all_transactions_subTitle")
    val allTransactionsSubTitle: String = "",

    @ColumnInfo(name = "all_transactions_total")
    val allTransactionsTotal: Float = 0.0F,
)