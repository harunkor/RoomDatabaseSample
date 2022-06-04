package com.harunkor.roomdatabasesample.presentation.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.harunkor.roomdatabasesample.BR
import com.harunkor.roomdatabasesample.R
import com.harunkor.roomdatabasesample.databinding.ItemAllTransactionBinding
import com.harunkor.roomdatabasesample.domain.model.AllTransactions

class TransactionAdapter(private val list: List<AllTransactions>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val transactionsBinding = DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_all_transaction,
            parent, false
        )
        return TransactionViewHolder(transactionsBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as TransactionViewHolder).onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class TransactionViewHolder(private val transactionsBinding: ViewDataBinding) :
        RecyclerView.ViewHolder(transactionsBinding.root) {
        fun onBind(transactionModel: AllTransactions) {
            val binding = transactionsBinding as ItemAllTransactionBinding
            binding.setVariable(BR.itemAllTranslation, transactionModel)
        }
    }
}


