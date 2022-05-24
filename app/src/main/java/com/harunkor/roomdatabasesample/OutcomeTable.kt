package com.harunkor.roomdatabasesample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "outcome_table")
data class OutcomeTable(
    @PrimaryKey(autoGenerate = true)
    var outcomeId: Long = 0L,
    @ColumnInfo(name = "outcome_title")
    val outcomeTitle: String = "",

    @ColumnInfo(name = "outcome_sub_title")
    val outcomeSubTitle: String = "",
    @ColumnInfo(name = "outcome_total")
    val outcomeTotal : Float = 0.0F,

    )