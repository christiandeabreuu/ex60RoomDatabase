package br.com.catalisa.ui.adicionarPersonagem

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import br.com.catalisa.R
import br.com.catalisa.data.Personagem

class AdicionarPersonagemActivity : AppCompatActivity() {

    private val nome by lazy { findViewById<EditText>(R.id.et_nome) }
    private val descricao by lazy { findViewById<EditText>(R.id.et_descricao) }
    private val imagem by lazy { findViewById<EditText>(R.id.et_imagem) }
    private val btnAdicionar by lazy { findViewById<Button>(R.id.btn_adicionar) }

    private val viewModel by viewModels<AdicionarPersonagemViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_personagem)

        btnAdicionar.setOnClickListener {
            addPersonagem(nome.text.toString(), imagem.text.toString(), descricao.text.toString())
            finish()
        }
    }

    private fun addPersonagem(nome: String, imagem: String, descricao: String) {
        viewModel.add(
            Personagem(
                nome = nome,
                imagem = imagem,
                descricao = descricao
            )
        )
    }
}