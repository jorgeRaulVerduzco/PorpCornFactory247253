package com.example.practica6_247253

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MovieDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_movie_detail)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val imgPelicula: ImageView = findViewById(R.id.iv_pelicula_imagen)
        val txtNombrePelicula: TextView = findViewById(R.id.tv_nombre_pelicula)
        val txtDescPelicula: TextView = findViewById(R.id.tv_pelicula_desc)
        val txtSeatLeft: TextView = findViewById(R.id.seatLeft)
        val btn: Button = findViewById(R.id.buyTickets)

        val bundle = intent.extras
        var ns = 0
        var id = -1
        var title = ""

        if (bundle != null){
            ns = bundle.getInt("numberSeats")
            title = bundle.getString("titulo")!!
            imgPelicula.setImageResource(bundle.getInt("image"))
            txtNombrePelicula.setText(bundle.getString("titulo"))
            txtDescPelicula.setText(bundle.getString("sinopsis"))
            txtSeatLeft.setText("$ns seats avaible")
            id = bundle.getInt("pos")


        }
        if(ns ==0){
            btn.isActivated = false
        }
        else{
            btn.isActivated = true
            btn.setOnClickListener{
                val intent: Intent = Intent(this, seatSelection::class.java)

                intent.putExtra("id", id)
                intent.putExtra("titulo", title)

                this.startActivity(intent)
            }
        }
    }
}