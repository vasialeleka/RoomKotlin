package com.vasialeleka.room2

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    public abstract  fun dao():UserDao
}