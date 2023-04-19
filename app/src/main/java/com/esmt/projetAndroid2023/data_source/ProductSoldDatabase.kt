package com.esmt.projetAndroid2023.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.esmt.projetAndroid2023.domain.entities.ProductSold


@Database(entities = [ProductSold::class], version = 1)
abstract class ProductSoldDatabase : RoomDatabase(){
    abstract  val productSoldDao: ProductSoldDao
}
