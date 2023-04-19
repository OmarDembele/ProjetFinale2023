package com.esmt.projetAndroid2023.data_source

import androidx.room.*
import com.esmt.projetAndroid2023.domain.entities.ProductSold
import kotlinx.coroutines.flow.Flow


@Dao
interface  ProductSoldDao {
    @Insert
    suspend fun insert(productSold: ProductSold): Long

    @Delete
    suspend fun delete(product: ProductSold)

    @Query("SELECT * FROM productSold ")
    fun getProductSold(): Flow<List<ProductSold>>

    @Query("SELECT * FROM productSold WHERE id = :id")
    suspend fun getProductSoldById(id: Int): ProductSold?
}