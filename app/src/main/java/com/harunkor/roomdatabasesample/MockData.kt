package com.harunkor.roomdatabasesample

import android.graphics.drawable.Drawable
import android.media.Image

object MockData {

    fun getIncomeTableList() = arrayListOf(
        IncomeTable(1, R.drawable.box,"Apple Music Subscription", "Apple Store", -50F),
        IncomeTable(2,R.drawable.box, "Spotify Music Subscription","Spotify", -50.0F),
        IncomeTable(3, R.drawable.box,"John Doe","Paypal", 150F),
        IncomeTable(1, R.drawable.box,"Emily Watts", "Citi Bank",200.0F),
    )
    fun getOutcomeTableList() = arrayListOf(
        OutcomeTable(1, R.drawable.box,"Apple Music Subscription", "Apple Store", -50F),
        OutcomeTable(2,R.drawable.box, "Spotify Music Subscription","Spotify", -50.0F),
        OutcomeTable(3, R.drawable.box,"John Doe","Paypal", 150F),
        OutcomeTable(1, R.drawable.box,"Emily Watts", "Citi Bank",200.0F),
    )

    fun getAllTableList() = arrayListOf(
        AllTranslation(1,"Apple Music Subscription", "Apple Store", -50F),
        AllTranslation(2,"Spotify Music Subscription","Spotify", -50.0F),
        AllTranslation(3,"John Doe","Paypal", 150F),
        AllTranslation(1,"Emily Watts", "Citi Bank",200.0F),
    )
}
