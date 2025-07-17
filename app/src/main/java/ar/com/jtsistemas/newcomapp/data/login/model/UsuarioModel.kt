package ar.com.jtsistemas.newcomapp.data.login.model

import java.util.Date

data class UsuarioModel(
    var id:Int,
    var usuario: String,
    var email: String,
    val password: String,
    val alta: Date,
    val activo: Boolean
)
