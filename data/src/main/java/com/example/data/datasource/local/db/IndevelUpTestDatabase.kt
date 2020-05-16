package com.example.data.datasource.local.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.data.datasource.local.db.dao.ResultDao
import com.example.data.datasource.local.db.dao.TermDao
import com.example.data.entity.ResultEntity
import com.example.data.entity.TermEntity

@Database(
    entities = [TermEntity::class, ResultEntity::class],
    version = 1,
    exportSchema = false
)
abstract class IndevelUpTestDatabase : RoomDatabase() {
    abstract fun termDao(): TermDao
    abstract fun resultDao(): ResultDao

    companion object {
        private const val DATABASE_NAME = "APP_INDEVELUP_TEST_DATABASE"
        private var INSTANCE: IndevelUpTestDatabase? = null

        fun getAppDatabase(context: Context): IndevelUpTestDatabase? {
            if (INSTANCE == null) {
                synchronized(IndevelUpTestDatabase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        IndevelUpTestDatabase::class.java,
                        DATABASE_NAME
                    ).build()
                }
            }

            return INSTANCE
        }
    }
}