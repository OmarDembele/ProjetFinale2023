package com.esmt.projetAndroid2023.data_source

import androidx.room.*
import com.esmt.projetAndroid2023.domain.entities.Product
import kotlinx.coroutines.flow.Flow

@Dao
interface ProductDao {

    @Insert
    suspend fun insert(product: Product): Long

    @Update
    suspend fun update(product: Product)

    @Delete
    suspend fun delete(product: Product)

    @Query("SELECT * FROM product ")
    fun getProduct(): Flow<List<Product>>

    @Query("SELECT quantity FROM product WHERE id = :id")
    suspend fun countProductByQuantity(id: Int): Int

    @Query("SELECT * FROM product WHERE id = :id")
    suspend fun getProductById(id: Int): Product?
}