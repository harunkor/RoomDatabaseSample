package com.harunkor.roomdatabasesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {

     private lateinit var arrayList : ArrayList<MockData>
    private val sleepViewModel: SleepViewModel by viewModels {
        SleepViewModelFactory((application as SleepApplication).repository)


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sleepViewModel.allNights.observe(this) { allNights ->
            Log.v("AKBANK", allNights.toString())

            arrayList = ArrayList()
            val listItem1 = MockData("Apple Music", -50)
            val listItem2 = MockData("Spotify Music", -50)
            val listItem3 = MockData("John Doe", +150)

            arrayList.add(listItem1)
            arrayList.add(listItem2)
            arrayList.add(listItem3)
        }

    }
}