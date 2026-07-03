package com.example.data

import kotlinx.coroutines.flow.Flow

class ShopRepository(private val shopDao: ShopDao) {
    val allCustomers: Flow<List<Customer>> = shopDao.getAllCustomers()

    suspend fun insertCustomer(customer: Customer) = shopDao.insertCustomer(customer)

    fun getTransactionsForCustomer(customerId: Int): Flow<List<DebtTransaction>> = shopDao.getTransactionsForCustomer(customerId)

    suspend fun insertTransaction(transaction: DebtTransaction) = shopDao.insertTransaction(transaction)
}
