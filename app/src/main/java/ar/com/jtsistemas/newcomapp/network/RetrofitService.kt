package ar.com.jtsistemas.newcomapp.network

import ar.com.jtsistemas.newcomapp.BASE_URL
import retrofit2.Retrofit
import retrofit2.create


object RetrofitService {

    var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .build().create()

}