package br.com.catalisa.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.recyclerview.widget.RecyclerView
import br.com.catalisa.R
import br.com.catalisa.ui.adicionarPersonagem.AdicionarPersonagemActivity

class HomeActivity : AppCompatActivity() {

    private val btnAdicionar by lazy { findViewById<Button>(R.id.btn_add) }
    private val rvPersonages by lazy { findViewById<RecyclerView>(R.id.rv_personagens) }

    private val viewModel by viewModels<HomeViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdicionar.setOnClickListener {
            startActivity(Intent(this, AdicionarPersonagemActivity::class.java))
        }

        viewModel.personagens.observe(this) { personagens ->
            personagens?.let {
                rvPersonages.adapter = PersonagemAdapter(it)
            }
        }
    }
}