package br.com.catalisa.repository.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PersonagemEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "nome")
    val nome: String,
    @ColumnInfo(name = "imagem")
    val imagem: String,
    @ColumnInfo(name = "descricao")
    val descricao: String
)