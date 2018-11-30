package com.example.usrdel.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Main5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
    }




    class BaseDeDatosArtista {
        companion object {
            val ArtistaB: ArrayList<String> = ArrayList()
            fun agregarArtista(nombre: String) {
                ArtistaB.add(nombre)
            }
        }
    }

    fun datosInicialesArtista() {


        BaseDeDatosArtista.agregarArtista("The Beatles")
        BaseDeDatosArtista.agregarArtista("ffff")
        BaseDeDatosArtista.agregarArtista("The ")
        BaseDeDatosArtista.agregarArtista("The fff")


    }



}
