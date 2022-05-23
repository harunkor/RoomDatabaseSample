package com.harunkor.roomdatabasesample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "all_translation_table")
data class AllTranslation(
        @PrimaryKey(autoGenerate = true)
        var traslationId: Long = 0L,

        @ColumnInfo(name = "translation_name")
        val translationName : String = "",

        @ColumnInfo(name = "translation_total")
        val totalTutorial : Long = 0L,
)
