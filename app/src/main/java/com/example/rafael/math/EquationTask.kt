package com.example.rafael.math

import android.os.AsyncTask
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class EquationTask():AsyncTask<Void,Void,ArrayList<Valuable>?>(){
    override fun doInBackground(vararg params: Void?): ArrayList<Valuable>? {
         val service = Retrofit
                .Builder()
                .baseUrl("http://192.168.0.6:8810/")
                .addConverterFactory(GsonConverterFactory.create()  )
                .build()
                .create(EquationService::class.java)
        return service
                .createEquation()
                .execute()
                .body()
    }
}