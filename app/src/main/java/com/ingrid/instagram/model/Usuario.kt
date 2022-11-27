package com.ingrid.instagram.model

class Usuario {

    private lateinit var id: String
    private lateinit var nome: String
    private lateinit var email: String
    private lateinit var senha: String
    private lateinit var caminhoPhoto: String

    public fun usuario(){
    }

    public fun getId(): String {
        return id
    }

    public fun getNome(): String {
        return nome
    }

    public fun getEmail(): String {
        return email
    }

    public fun getSenha(): String {
        return senha
    }

    public fun getCaminhoPhoto(): String {
        return caminhoPhoto
    }

    public fun setId(id: String) {
        this.id = id
    }

    public fun setNome(nome: String) {
        this.nome = nome
    }

    public fun setSenha(senha: String) {
        this.senha = senha
    }

    public fun setEmail(email: String) {
        this.email = email
    }
    public fun setCaminhoPhoto(photo: String) {
       this.caminhoPhoto = photo
    }
}