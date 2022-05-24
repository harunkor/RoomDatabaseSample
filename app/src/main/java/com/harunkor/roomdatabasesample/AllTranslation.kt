package com.harunkor.roomdatabasesample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "all_translation_table")
data class AllTranslation(
    @PrimaryKey(autoGenerate = true)
    var traslationId: Long = 0L,

    @ColumnInfo(name = "translation_title")
    val translationTitle : String = "",

    @ColumnInfo(name = "translation_sub_title")
    val translationSubTitle : String = "",

    @ColumnInfo(name = "translation_total")
    val totalTutorial : Float = 0.0F,
)