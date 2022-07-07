package br.com.catalisa.ui.home

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.catalisa.R
import br.com.catalisa.data.Personagem
import com.bumptech.glide.Glide

class PersonagemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val imagem by lazy { itemView.findViewById<ImageView>(R.id.iv_imagem) }
    private val nome by lazy { itemView.findViewById<TextView>(R.id.tv_nome) }
    private val descricao by lazy { itemView.findViewById<TextView>(R.id.tv_descricao) }

    fun setDadosPersonagem(personagem: Personagem) {
        Glide.with(itemView.context).load(personagem.imagem).into(imagem)
        nome.text = personagem.nome
        descricao.text = personagem.descricao
    }
}