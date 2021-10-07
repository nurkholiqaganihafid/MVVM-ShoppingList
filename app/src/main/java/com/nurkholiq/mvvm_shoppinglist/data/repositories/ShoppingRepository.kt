package com.nurkholiq.mvvm_shoppinglist.data.repositories

import com.nurkholiq.mvvm_shoppinglist.data.db.ShoppingDatabase
import com.nurkholiq.mvvm_shoppinglist.data.db.entities.ShoppingItem

class ShoppingRepository(
    private val db: ShoppingDatabase
) {
    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItem() = db.getShoppingDao().getAllShoppingItems()
}