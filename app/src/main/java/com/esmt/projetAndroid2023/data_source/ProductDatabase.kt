package com.esmt.projetAndroid2023.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.esmt.projetAndroid2023.domain.entities.Product


@Database(entities = [Product::class], version = 1)
abstract class ProductDatabase : RoomDatabase(){
    abstract  val productDao: ProductDao
}