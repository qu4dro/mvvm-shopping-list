package ru.orlovvv.mvvmshoppinglist.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import ru.orlovvv.mvvmshoppinglist.data.db.entities.ShoppingItem

@Dao
interface ShoppingDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: ShoppingItem)

    @Delete
    suspend fun delete(item: ShoppingItem)

    @Query("SELECT * FROM shopping_items")
    suspend fun getAllShoppingItems(): LiveData<List<ShoppingItem>>
}