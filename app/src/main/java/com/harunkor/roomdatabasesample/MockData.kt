package com.harunkor.roomdatabasesample

import android.media.Image

class MockData {
    var id: Long = 0
    lateinit var transferTitle: String
    lateinit var transferSubTitle: String
    var total: Float = 0.0f

    constructor(id:Long, transferTitle: String,transferSubTitle: String, total: Float)

    val listItem1 = MockData(1, "Apple Music Subscription", "Apple Store", -50F)
    val listItem2 = MockData(2, "Spotify Music Subscription","Spotify", -50.0F)
    val listItem3 = MockData(3, "John Doe","Paypal", 150F)
    val listItem4 = MockData(1, "Emily Watts", "Citi Bank",200.0F)
}
