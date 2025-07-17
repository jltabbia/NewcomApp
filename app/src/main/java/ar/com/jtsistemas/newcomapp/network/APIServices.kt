package ar.com.jtsistemas.newcomapp.network

import ar.com.jtsistemas.newcomapp.BASE_LOGIN
import com.google.firebase.firestore.auth.User
import retrofit2.http.GET


interface APIServices {
    @GET(BASE_LOGIN +"lista_teams.php")
    suspend fun getUser(user: String?, pass: String): List<User>
}