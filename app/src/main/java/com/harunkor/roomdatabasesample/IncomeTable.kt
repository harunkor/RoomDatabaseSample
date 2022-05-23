package com.harunkor.roomdatabasesample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "income_table")
data class IncomeTable(
    @PrimaryKey(autoGenerate = true)
    var incomeId: Long = 0L,

    @ColumnInfo(name = "income_name")
    val incomeName : String = "",

    @ColumnInfo(name = "income_total")
    val incomeTotal : Long = 0L,

)
