package com.example

import android.app.Application
import androidx.room.Room
import com.example.data.AppDatabase
import com.example.data.ShopRepository

class ShopApplication : Application() {
    val database by lazy { Room.databaseBuilder(this, AppDatabase::class.java, "shop_database").build() }
    val repository by lazy { ShopRepository(database.shopDao()) }
}
