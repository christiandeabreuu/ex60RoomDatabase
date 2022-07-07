package br.com.catalisa.repository.dataBase

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.catalisa.repository.dao.PersonagemDao
import br.com.catalisa.repository.entity.PersonagemEntity

@Database(entities = [PersonagemEntity::class], version = 1)
abstract class CatalisaDataBase : RoomDatabase() {
    abstract fun personagemDao(): PersonagemDao
}