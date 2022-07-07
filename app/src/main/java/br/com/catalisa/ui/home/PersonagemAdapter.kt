package br.com.catalisa.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.catalisa.R
import br.com.catalisa.data.Personagem

class PersonagemAdapter(val listaPersonagens: List<Personagem>) :
    RecyclerView.Adapter<PersonagemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonagemViewHolder {
        val itemDaLista = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_lista_personagem, parent, false)
        return PersonagemViewHolder(
            itemDaLista
        )
    }

    override fun onBindViewHolder(holder: PersonagemViewHolder, position: Int) {
        holder.setDadosPersonagem(listaPersonagens[position])
    }

    override fun getItemCount(): Int {
        return listaPersonagens.size
    }
}