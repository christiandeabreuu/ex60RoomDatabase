package br.com.catalisa.repository.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import br.com.catalisa.repository.entity.PersonagemEntity

@Dao
interface PersonagemDao {

    @Query("SELECT * FROM PersonagemEntity")
    fun getAll(): LiveData<List<PersonagemEntity>>

    @Insert
    fun insertAll(vararg users: PersonagemEntity)
}