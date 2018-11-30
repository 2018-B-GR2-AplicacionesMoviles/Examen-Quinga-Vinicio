package com.example.usrdel.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        segundo.setOnClickListener{
            this.irPantallaCuarta()
        }

        primer.setOnClickListener{
            this.irAPantallaSegunda()
        }
    }




    fun irAPantallaSegunda() {
        // INTENT
        val intentRespuesta = Intent(this, Main2Activity  ::class.java)
        this.startActivity(intentRespuesta)
    }


    fun irPantallaCuarta() {
        // INTENT
        val intentRespuesta = Intent(this, Main4Activity  ::class.java)
        this.startActivity(intentRespuesta)
    }








}
