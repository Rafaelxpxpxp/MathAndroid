package com.example.rafael.math

import retrofit2.Call
import retrofit2.http.GET


interface EquationService{

    @GET("/api/operation?min=1&max=19&equations=1")
    fun createEquation(): Call<ArrayList<Valuable>>
}