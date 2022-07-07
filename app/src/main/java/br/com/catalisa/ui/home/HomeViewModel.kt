package br.com.catalisa.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import br.com.catalisa.data.Personagem
import br.com.catalisa.repository.PersonagemRepository

class HomeViewModel : ViewModel() {

    private val repository = PersonagemRepository()

    private val _personagensMediator = MediatorLiveData<List<Personagem>>()
    val personagens: LiveData<List<Personagem>> = _personagensMediator

    init {
        _personagensMediator.addSource(repository.getPersonagens()) { personagensRepository ->
            val listaPersonagem = mutableListOf<Personagem>()
            personagensRepository.forEach {
                listaPersonagem.add(
                    Personagem(
                        id = it.id,
                        nome = it.nome,
                        imagem = it.imagem,
                        descricao = it.descricao
                    )
                )
            }
            _personagensMediator.value = listaPersonagem
        }
    }
}