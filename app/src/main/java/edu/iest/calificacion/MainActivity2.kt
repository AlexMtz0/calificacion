package edu.iest.calificacion

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var  tvAviso : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val califRecibida = intent.getStringExtra("calificacion")
        val calif = califRecibida.toString().toDouble()
        

        tvAviso = findViewById(R.id.tvAviso)

        Decision(calif)
    }

    private fun Decision(x:Double){
        if (x < 6 && x >= 0){
            tvAviso.text = "Tu calificación fue $x, sigue participando"
            val color : TextView = findViewById(R.id.tvAviso)
            color.setTextColor(Color.RED)
        }else{
            tvAviso.text = "Tu calificación fue $x, felicidades, aprobaste"
            val color : TextView = findViewById(R.id.tvAviso)
            color.setTextColor(Color.GREEN)
        }
    }

}