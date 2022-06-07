package com.harunkor.roomdatabasesample.presentation.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.harunkor.roomdatabasesample.AllTransactionsApplication
import com.harunkor.roomdatabasesample.R
import com.harunkor.roomdatabasesample.databinding.FragmentMainBinding
import com.harunkor.roomdatabasesample.presentation.addmoney.AddMoneyFragment


class HomeFragment: Fragment() {
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
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        activityMainBinding.buttonAddMoney.setOnClickListener {
//            val string2="Give Money"
//            val bundle=Bundle()
//            bundle.putString("data",string2)
//
//            val fragment=AddMoneyFragment()
//            fragment.arguments=bundle
//            fragmentManager?.beginTransaction()?.replace(R.id.fragmentContainerView,fragment)?.commit()

            findNavController().navigate(R.id.action_app_bar_main_to_addMoneyFragment)
        }
        activityMainBinding.imgAdd.setOnClickListener {
            findNavController().navigate(R.id.action_app_bar_main_to_addMoneyFragment)
        }
        activityMainBinding.buttonTransfer.setOnClickListener {
//            val string1="Send Money"
//            val bundle=Bundle()
//            bundle.putString("data",string1)
//
//            val fragment=AddMoneyFragment()
//            fragment.arguments=bundle
//            fragmentManager?.beginTransaction()?.replace(R.id.fragmentContainerView,fragment)?.commit()

            findNavController().navigate(R.id.action_app_bar_main_to_addMoneyFragment)
        }


        super.onViewCreated(view, savedInstanceState)

    }






}


