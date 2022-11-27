package com.ingrid.instagram.activity

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.core.view.isGone
import com.ingrid.instagram.databinding.ActivityCadastroBinding
import com.ingrid.instagram.databinding.ActivityLoginBinding
import com.ingrid.instagram.model.Usuario

class CadastroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroBinding
    private lateinit var campoUsuario: EditText
    private lateinit var campoEmail: EditText
    private lateinit var campoSenha: EditText
    private lateinit var botaoCadastrar: Button
    private lateinit var progressBar: ProgressBar
    private lateinit var usuario: Usuario

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastroBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initComponents()
    }

    fun initComponents() {
        campoUsuario = binding.edtCadastrarNome
        campoEmail = binding.edtCadastrarEmail
        campoSenha = binding.editCadastrarPassword
        botaoCadastrar = binding.btnCadastrar
        progressBar = binding.progressBar
    }


    fun clickListener(view: View) {
        progressBar.visibility = GONE
        botaoCadastrar.setOnClickListener() {
            progressBar.visibility = view.visibility

            if (campoUsuario != null && campoEmail != null && campoSenha != null) {
                usuario = Usuario()
                usuario.setNome(campoUsuario.toString())
                usuario.setEmail(campoEmail.toString())
                usuario.setSenha(campoSenha.toString())
                cadastrar(usuario)
            } else {
                verifyField()
            }
        }
    }

    fun cadastrar(usuario: Usuario ){

    }

    fun verifyField() {
        if (campoUsuario == null) {
            Toast.makeText(this, "Preencha o campo nome!", Toast.LENGTH_LONG).show()
        }

        if (campoEmail == null) {
            Toast.makeText(this, "Preencha o campo Email!", Toast.LENGTH_LONG).show()
        }

        if (campoSenha == null) {
            Toast.makeText(this, "Preencha o campo Senha!", Toast.LENGTH_LONG).show()
        }
    }
}