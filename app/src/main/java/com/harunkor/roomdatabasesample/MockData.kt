package com.harunkor.roomdatabasesample

object MockData {

    fun getIncomeTableList() = arrayListOf(
        IncomeTable(companyLogo = R.drawable.ic_apple_seeklogo_com, incomeTitle = "Apple Music Subscription", incomeSubTitle = "Apple Store", incomeTotal = 50F),
        IncomeTable(companyLogo = R.drawable.ic_spotify_seeklogo_com, incomeTitle = "Spotify Music Subscription", incomeSubTitle = "Spotify", incomeTotal = 50.0F),
        IncomeTable(companyLogo = R.drawable.ic_paypal_seeklogo_com, incomeTitle = "John Doe", incomeSubTitle = "Paypal", incomeTotal = 150F),
        IncomeTable(companyLogo = R.drawable.ic_paypal_seeklogo_com, incomeTitle = "Emily Watts", incomeSubTitle = "Citi Bank", incomeTotal = 200.0F),
    )

    fun getOutcomeTableList() = arrayListOf(
        OutcomeTable(companyLogo = R.drawable.ic_apple_seeklogo_com, outcomeTitle = "Apple Music Subscription", outcomeSubTitle = "Apple Store", outcomeTotal = -50F),
        OutcomeTable(companyLogo = R.drawable.ic_spotify_seeklogo_com, outcomeTitle = "Spotify Music Subscription", outcomeSubTitle = "Spotify", outcomeTotal = -50.0F),
        OutcomeTable(companyLogo = R.drawable.ic_paypal_seeklogo_com, outcomeTitle = "John Doe", outcomeSubTitle = "Paypal", outcomeTotal = -150F),
        OutcomeTable(companyLogo = R.drawable.ic_apple_seeklogo_com, outcomeTitle = "Emily Watts", outcomeSubTitle = "Citi Bank", outcomeTotal = -200.0F),
    )

    fun getAllTableList() = arrayListOf(
        AllTransactions(companyLogo = R.drawable.ic_apple_seeklogo_com, allTransactionsTitle = "Apple Music Subscription", allTransactionsSubTitle = "Apple Store", allTransactionsTotal = 50F),
        AllTransactions(companyLogo = R.drawable.ic_spotify_seeklogo_com, allTransactionsTitle = "Spotify Music Subscription", allTransactionsSubTitle = "Spotify", allTransactionsTotal = 50.0F),
        AllTransactions(companyLogo = R.drawable.ic_paypal_seeklogo_com, allTransactionsTitle = "John Doe", allTransactionsSubTitle = "Paypal", allTransactionsTotal = 150F),
        AllTransactions(companyLogo = R.drawable.ic_paypal_seeklogo_com, allTransactionsTitle = "Emily Watts", allTransactionsSubTitle = "Citi Bank", allTransactionsTotal = 200.0F),
        AllTransactions(companyLogo = R.drawable.ic_apple_seeklogo_com, allTransactionsTitle = "Apple Music Subscription", allTransactionsSubTitle = "Apple Store", allTransactionsTotal = -50F),
        AllTransactions(companyLogo = R.drawable.ic_spotify_seeklogo_com, allTransactionsTitle = "Spotify Music Subscription", allTransactionsSubTitle = "Spotify", allTransactionsTotal = -50.0F),
        AllTransactions(companyLogo = R.drawable.ic_paypal_seeklogo_com, allTransactionsTitle = "John Doe", allTransactionsSubTitle = "Paypal", allTransactionsTotal = -150F),
        AllTransactions(companyLogo = R.drawable.ic_paypal_seeklogo_com, allTransactionsTitle = "Emily Watts", allTransactionsSubTitle = "Citi Bank", allTransactionsTotal = 200.0F),

    )
}
