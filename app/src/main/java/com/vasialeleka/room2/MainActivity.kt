package com.vasialeleka.room2

import android.arch.persistence.room.Room
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var db = Room
            .databaseBuilder(applicationContext, AppDatabase::class.java, "datab")
            .allowMainThreadQueries()
            .build()

        for (i in 0..5) {
            var user = User()
            user.name = "" + i
            db.dao().insert(user)

        }


        var list = db.dao().getAllUsers()
        var l = " s"
    }
}
