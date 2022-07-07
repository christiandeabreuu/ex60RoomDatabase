package br.com.catalisa

import android.app.Application
import androidx.room.Room
import br.com.catalisa.repository.dataBase.CatalisaDataBase

class CatalisaApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(
            applicationContext,
            CatalisaDataBase::class.java, "database-catalisa"
        ).allowMainThreadQueries().build()
    }

    companion object {
        private lateinit var db: CatalisaDataBase

        fun getDb(): CatalisaDataBase = db
    }
}