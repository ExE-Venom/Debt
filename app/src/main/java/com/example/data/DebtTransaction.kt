package com.example.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "transactions")
data class DebtTransaction(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val customerId: Int,
    val amount: Double,
    val description: String,
    val imageUrl: String? = null,
    val date: Long = System.currentTimeMillis()
)
