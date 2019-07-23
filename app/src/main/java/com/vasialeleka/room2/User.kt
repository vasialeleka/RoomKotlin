package com.vasialeleka.room2

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class User {

    @PrimaryKey(autoGenerate = true)
    var id: Int? = null


    @ColumnInfo(name = "first")
    var name: String? = null
}