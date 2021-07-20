package com.example.a55radiogroupyradiobutton_kotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var resultado: String = "Programación con Android"
        var colorrojo: String = ""
        var colorverde: String = ""
        var colorazul: String = ""
        var coloramarillo: String = ""
        var numero = 1



        btn_aceptar.setOnClickListener() {
            tv_resultado.setText(resultado)
            numero=rg_Colores.checkedRadioButtonId;

        when (numero) {
            R.id.rb_rojo ->  tv_resultado.setTextColor(Color.RED)
            R.id.rb_verde -> tv_resultado.setTextColor(Color.GREEN)
            R.id.rb_azul -> tv_resultado.setTextColor(Color.BLUE)
            R.id.rb_amarillo ->  tv_resultado.setTextColor(Color.YELLOW)
            else -> tv_resultado.setTextColor(Color.RED)
        }
    }



    }
}