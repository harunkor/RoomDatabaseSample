package com.harunkor.roomdatabasesample.presentation.addmoney

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.harunkor.roomdatabasesample.R
import com.harunkor.roomdatabasesample.databinding.FragmentAddMoneyBinding
import com.harunkor.roomdatabasesample.presentation.home.HomeFragmentDirections

class AddMoneyFragment : Fragment() {

    private lateinit var addMoneyBinding: FragmentAddMoneyBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        addMoneyBinding = FragmentAddMoneyBinding.inflate(inflater, container, false)//***
        return addMoneyBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        addMoneyBinding.imagebutton.setOnClickListener {
            findNavController().navigate(R.id.homeFragment)
        }
        addMoneyBinding.btn1.setOnClickListener {
            addMoneyBinding.numbertext.append("1")
        }

        addMoneyBinding.btn2.setOnClickListener {
            addMoneyBinding.numbertext.append("2")
        }

        addMoneyBinding.btn3.setOnClickListener {
            addMoneyBinding.numbertext.append("3")
        }

        addMoneyBinding.btn4.setOnClickListener {
            addMoneyBinding.numbertext.append("4")
        }

        addMoneyBinding.btn5.setOnClickListener {
            addMoneyBinding.numbertext.append("5")
        }

        addMoneyBinding.btn6.setOnClickListener {
            addMoneyBinding.numbertext.append("6")
        }

        addMoneyBinding.btn7.setOnClickListener {
            addMoneyBinding.numbertext.append("7")
        }

        addMoneyBinding.btn8.setOnClickListener {
            addMoneyBinding.numbertext.append("8")
        }

        addMoneyBinding.btn9.setOnClickListener {
            addMoneyBinding.numbertext.append("9")
        }

        addMoneyBinding.btndot.setOnClickListener {
            addMoneyBinding.numbertext.append(".")
        }

        addMoneyBinding.btnback.setOnClickListener {

           if (addMoneyBinding.numbertext.text.isNotEmpty() ){
                val resultText = addMoneyBinding.numbertext.text
                addMoneyBinding.numbertext.text = resultText.substring(0, resultText.length - 1)
            }

        }
        addMoneyBinding.btn0.setOnClickListener {
            addMoneyBinding.numbertext.append("0")
        }
        addMoneyBinding.switchCompat.setOnClickListener {
            if (addMoneyBinding.switchCompat.isChecked){
                Toast.makeText(getActivity(),"Acık!",Toast.LENGTH_SHORT).show();
            }
        }
        addMoneyBinding.buttonTransfer.setOnClickListener {
            findNavController().navigate(R.id.addPaymentFragment)
        }
    }
}