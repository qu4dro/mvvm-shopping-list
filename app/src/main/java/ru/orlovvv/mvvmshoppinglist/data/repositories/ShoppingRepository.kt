package ru.orlovvv.mvvmshoppinglist.data.repositories

import ru.orlovvv.mvvmshoppinglist.data.db.ShoppingDatabase
import ru.orlovvv.mvvmshoppinglist.data.db.entities.ShoppingItem

class ShoppingRepository(private val db: ShoppingDatabase) {

    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}