package com.harunkor.roomdatabasesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

  private lateinit var translaRoomDatabase: AllTraslationRoomDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment

        val incomeList = MockData.getIncomeTableList()
        Log.d("list", incomeList.toString())
        val outcomeList = MockData.getOutcomeTableList()
        val allTranslation = MockData.getOutcomeTableList()
        val navController = navHostFragment.navController


        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottom_navigation_view)
        bottomNavigation.setupWithNavController(navController)


    }
}