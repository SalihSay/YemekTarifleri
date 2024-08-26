package com.example.yemektarifleri.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.yemektarifleri.model.Tarif

@Database(entities = [Tarif::class], version = 1)
abstract class TarifDatabase : RoomDatabase() {
    abstract fun tarifDao() : TarifDAO
}