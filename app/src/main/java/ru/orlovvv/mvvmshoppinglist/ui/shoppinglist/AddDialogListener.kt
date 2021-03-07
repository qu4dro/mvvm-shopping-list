package ru.orlovvv.mvvmshoppinglist.ui.shoppinglist

import ru.orlovvv.mvvmshoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {

    fun onAddButtonClicked(item: ShoppingItem)


}