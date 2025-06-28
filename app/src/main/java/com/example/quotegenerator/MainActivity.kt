package com.example.quotegenerator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    private lateinit var textQuote: TextView
    private lateinit var textAuthor: TextView
    private lateinit var button1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote_generator)
        textQuote = findViewById<TextView>(R.id.textQuote)
        textAuthor = findViewById<TextView>(R.id.textAuthor)
        button1 = findViewById<Button>(R.id.button )
        button1.setOnClickListener { generateQuote() }

        }

    private fun generateQuote() {
        val quoteList = listOf("La vida es como montar en bicicleta. Para mantener el equilibrio, debes seguir moviéndote.", "El futuro pertenece a quienes creen en la belleza de sus sueños." , "La única forma de hacer un gran trabajo es amar lo que haces.")
        val autoreList = listOf("Albert Einstein", "Eleanor Roosevelt" , "Steve Jobs")
        val randomIndex = (0 until quoteList.size).random()
        textQuote.text = quoteList[randomIndex]
        textAuthor.text = autoreList[randomIndex]
    }
}





