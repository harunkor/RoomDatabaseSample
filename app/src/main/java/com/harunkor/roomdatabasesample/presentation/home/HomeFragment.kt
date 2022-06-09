package com.harunkor.roomdatabasesample.presentation.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.harunkor.roomdatabasesample.AllTransactionsApplication
import com.harunkor.roomdatabasesample.R
import com.harunkor.roomdatabasesample.databinding.FragmentHomeBinding

class HomeFragment: Fragment() {
    private val allTranslationViewModel: MainFragmentViewModel by viewModels {
        MainFragmentViewModelFactory((requireActivity().application as AllTransactionsApplication).repository)
    }
    private lateinit var fragmentHomeBinding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        allTranslationViewModel.allTranslations.observe(this) {

            fragmentHomeBinding.rvMain.apply {
                layoutManager = LinearLayoutManager(context)
                adapter = TransactionAdapter(it)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false)
        return fragmentHomeBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {



        fragmentHomeBinding.imgAdd.setOnClickListener {
            findNavController().navigate(R.id.addMoneyFragment)
        }

        super.onViewCreated(view, savedInstanceState)

    }






}


