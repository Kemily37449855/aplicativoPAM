package com.example.aplicativopan

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.aulaid)

        val nota1 = findViewById<EditText>(R.id.editNota1)
        val nota2 = findViewById<EditText>(R.id.editNota2)
        val resultado = findViewById<TextView>(R.id.txtResultado)
        val botao =  findViewById<Button>(R.id.btnCalcular)

        botao.setOnClickListener {

            resultado.text =( (nota1.text.toString().toFloat()
                    + nota2.text.toString().toFloat())/2 ).toString()

        }


    }
}