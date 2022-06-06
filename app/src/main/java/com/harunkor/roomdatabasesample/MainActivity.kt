package com.harunkor.roomdatabasesample

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.harunkor.roomdatabasesample.databinding.ActivityMainBinding
import com.harunkor.roomdatabasesample.utils.MockData


class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding
    private val allTranslationViewModel: MainViewModel by viewModels {
        AllTranslationViewModelFactory((application as AllTransactionsApplication).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottom_navigation_view)
        bottomNavigation.setupWithNavController(navController)

       navController.addOnDestinationChangedListener { controller, destination, arguments ->
            if (destination.id == R.id.addMoneyFragment) {
                activityMainBinding.walletBottomBar.visibility = View.GONE
                activityMainBinding.walletFloatButton.visibility = View.GONE
            } else{
                activityMainBinding.walletBottomBar.visibility = View.VISIBLE
                activityMainBinding.walletFloatButton.visibility = View.VISIBLE
            }
        }


        allTranslationViewModel.allTranslations.observe(this) { allTranslations ->
            Log.v("All Translations", allTranslations.toString())
        }

        allTranslationViewModel.allIncomes.observe(this) { allIncomes ->
            Log.v("All Incomes", allIncomes.toString())
        }

        allTranslationViewModel.allOutcomes.observe(this) { allOutcomes ->
            Log.v("All Outcomes", allOutcomes.toString())
        }

        loadData()

    }

    private fun loadData() {
        val allTranslationList = MockData.getAllTableList()
        val incomeList = MockData.getIncomeTableList()
        val outcomeList = MockData.getOutcomeTableList()

        for (translation in allTranslationList) {
            allTranslationViewModel.insertAllTranslation(translation)
        }

        for (income in incomeList) {
            allTranslationViewModel.insertIncome(income)
        }

        for (outcome in outcomeList) {
            allTranslationViewModel.insertOutcome(outcome)
        }
    }
}
