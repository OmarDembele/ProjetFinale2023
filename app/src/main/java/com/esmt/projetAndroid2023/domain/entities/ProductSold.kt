package com.esmt.projetAndroid2023.domain.entities

import androidx.room.PrimaryKey
import java.util.Date

data class ProductSold(
    @PrimaryKey(autoGenerate = true) val id: Int? = 0,
    val name: String,
    val price: Long,
    val quantity: String,
    val date: Date
)
