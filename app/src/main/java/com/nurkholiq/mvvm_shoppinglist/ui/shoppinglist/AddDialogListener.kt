package com.nurkholiq.mvvm_shoppinglist.ui.shoppinglist

import com.nurkholiq.mvvm_shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {

    fun onAddButtonClicked(item:ShoppingItem)

}