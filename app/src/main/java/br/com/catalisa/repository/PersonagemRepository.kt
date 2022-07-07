package br.com.catalisa.repository

import androidx.lifecycle.LiveData
import br.com.catalisa.CatalisaApplication
import br.com.catalisa.data.Personagem
import br.com.catalisa.repository.entity.PersonagemEntity

class PersonagemRepository {

    private val bancoDeDados = CatalisaApplication.getDb()

    fun getPersonagens(): LiveData<List<PersonagemEntity>> {
        return bancoDeDados.personagemDao().getAll()
    }

    fun addPersonagem(personagem: Personagem) {
        val personagemEntity = PersonagemEntity(
            id = personagem.id,
            nome = personagem.nome,
            imagem = personagem.imagem,
            descricao = personagem.descricao
        )
        bancoDeDados.personagemDao().insertAll(personagemEntity)
    }
}