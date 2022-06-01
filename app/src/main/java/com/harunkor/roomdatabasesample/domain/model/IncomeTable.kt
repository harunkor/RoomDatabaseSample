package com.harunkor.roomdatabasesample.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "income_table")
data class IncomeTable(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "income_id")
    var incomeId: Int = 0,
    
    @ColumnInfo(name = "campany_logo")
    val companyLogo : Int = 0,

    @ColumnInfo(name = "income_title")
    val incomeTitle : String = "",

    @ColumnInfo(name = "income_subTitle")
    val incomeSubTitle : String = "",

    @ColumnInfo(name = "income_total")
    val incomeTotal : Float = 0.0F,

    )