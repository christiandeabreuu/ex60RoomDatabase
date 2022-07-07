package br.com.catalisa.ui.adicionarPersonagem

import androidx.lifecycle.ViewModel
import br.com.catalisa.data.Personagem
import br.com.catalisa.repository.PersonagemRepository

class AdicionarPersonagemViewModel : ViewModel() {

    private val repository = PersonagemRepository()

    fun add(personagem: Personagem) {
        repository.addPersonagem(personagem)
    }
}