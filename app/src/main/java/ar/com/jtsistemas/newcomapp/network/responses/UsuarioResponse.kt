package ar.com.jtsistemas.newcomapp.network.responses

import java.util.Date

data class UsuarioResponse(
    var id:Int,
    var usuario: String,
    var email: String,
    val password: String,
    val alta: Date,
    val activo: Boolean
)
