package com.piyal.hiltwithmvvm.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.piyal.hiltwithmvvm.models.Product

@Database(entities = [Product::class], version = 1)
abstract class FakerDB : RoomDatabase() {

    abstract fun getFakerDAO() : FakerDAO

}