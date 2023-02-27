package edu.iest.calificacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var etCal : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etCal = findViewById(R.id.etCal)

        val ivVista = findViewById<ImageView>(R.id.ivVista)
        ivVista.setOnClickListener{
            val y = Intent(this,MainActivity2::class.java)
            y.putExtra("calificacion", ObtenerCalificacion())
            startActivity(y)
            finish()
        }
    }
    private fun ObtenerCalificacion():String{
        return etCal.text.toString()
    }
}