package com.harunkor.roomdatabasesample.presentation.addpayment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.harunkor.roomdatabasesample.R
import com.harunkor.roomdatabasesample.databinding.FragmentAddPaymentBinding



class AddPaymentFragment : Fragment() {
    private lateinit var addPaymentBinding: FragmentAddPaymentBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        addPaymentBinding = FragmentAddPaymentBinding.inflate(inflater, container, false)//***
        return addPaymentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        addPaymentBinding.imagebutton.setOnClickListener {
            findNavController().navigate(R.id.homeFragment)
        }
        addPaymentBinding.btn1.setOnClickListener {
            addPaymentBinding.numbertext.append("1")
        }

        addPaymentBinding.btn2.setOnClickListener {
            addPaymentBinding.numbertext.append("2")
        }

        addPaymentBinding.btn3.setOnClickListener {
            addPaymentBinding.numbertext.append("3")
        }

        addPaymentBinding.btn4.setOnClickListener {
            addPaymentBinding.numbertext.append("4")
        }

        addPaymentBinding.btn5.setOnClickListener {
            addPaymentBinding.numbertext.append("5")
        }

        addPaymentBinding.btn6.setOnClickListener {
            addPaymentBinding.numbertext.append("6")
        }

        addPaymentBinding.btn7.setOnClickListener {
            addPaymentBinding.numbertext.append("7")
        }

        addPaymentBinding.btn8.setOnClickListener {
            addPaymentBinding.numbertext.append("8")
        }

        addPaymentBinding.btn9.setOnClickListener {
            addPaymentBinding.numbertext.append("9")
        }

        addPaymentBinding.btndot.setOnClickListener {
            addPaymentBinding.numbertext.append(".")
        }

        addPaymentBinding.btnback.setOnClickListener {

            if (addPaymentBinding.numbertext.text.isNotEmpty() ){
                val resultText = addPaymentBinding.numbertext.text
                addPaymentBinding.numbertext.text = resultText.substring(0, resultText.length - 1)
            }

        }
        addPaymentBinding.btn0.setOnClickListener {
            addPaymentBinding.numbertext.append("0")
        }
        addPaymentBinding.switchCompat.setOnClickListener {
            if (addPaymentBinding.switchCompat.isChecked){
                Toast.makeText(getActivity(),"Acık!", Toast.LENGTH_SHORT).show();
            }
        }
        addPaymentBinding.buttonAddMoney.setOnClickListener {
            findNavController().navigate(R.id.addMoneyFragment)
        }
    }
}
