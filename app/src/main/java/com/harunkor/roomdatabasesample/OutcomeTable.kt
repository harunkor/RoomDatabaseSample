package com.harunkor.roomdatabasesample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "income_table")
data class OutcomeTable(
    @PrimaryKey(autoGenerate = true)
    var outcomeId: Long = 0L,
    @ColumnInfo(name = "outcome_name")
    val outcomeName : String = "",

    @ColumnInfo(name = "outcome_total")
    val outcomeTotal : Long = 0L,

)
