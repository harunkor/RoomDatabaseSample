package com.harunkor.roomdatabasesample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.harunkor.roomdatabasesample.databinding.FragmentMainBinding



class MainFragment: Fragment() {
    private val allTranslationViewModel: MainFragmentViewModel by viewModels {
        MainFragmentViewModelFactory((requireActivity().application as AllTransactionsApplication).repository)
    }

    private lateinit var activityMainBinding: FragmentMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        allTranslationViewModel.allTranslations.observe(this) {

            activityMainBinding.rvMain.apply {
                layoutManager = LinearLayoutManager(context)
                adapter = TransactionAdapter(it)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        activityMainBinding = FragmentMainBinding.inflate(inflater, container, false)

        return activityMainBinding.root
    }





}


