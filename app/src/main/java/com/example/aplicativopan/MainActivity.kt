package com.example.aplicativopan

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.aplicativopan.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.atividade)

        val nota1 = findViewById<EditText>(R.id.editNota1)
        val nota2 = findViewById<EditText>(R.id.editNota2)
        val resultadoMedia = findViewById<TextView>(R.id.txtResultado)
        val botaoMedia = findViewById<Button>(R.id.btnCalcular)

        botaoMedia.setOnClickListener {
            val p1 = nota1.text.toString().toFloatOrNull()
            val p2 = nota2.text.toString().toFloatOrNull()

            if (p1 != null && p2 != null) {
                val media = (p1 + p2) / 2
                resultadoMedia.text = "Média é %.2f".format(media)
            } else {
                resultadoMedia.text = "Digite as duas notas"
            }
        }

        val peso = findViewById<EditText>(R.id.editPeso)
        val altura = findViewById<EditText>(R.id.editAltura)
        val resultadoImc = findViewById<TextView>(R.id.txtClassificação)
        val botaoImc = findViewById<Button>(R.id.btnIMC)
        botaoImc.setOnClickListener {
            val pesoValor = peso.text.toString().toFloatOrNull()
            val alturaValor = altura.text.toString().toFloatOrNull()
            if (pesoValor != null && alturaValor != null && alturaValor > 0f) {
                val imc = pesoValor / (alturaValor * alturaValor)
                resultadoImc.text = String.format("Seu IMC é: %.2f", imc)
            } else {
                resultadoImc.text = "Digite peso e altura válidos!"

            }
        }

    }
}



