package com.example.recyclerview_zefania_36

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_ryuzaalysyahputra_29.R

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val anggotaList = listOf<Wisata>(
            Wisata(
                R.drawable.tugu,
                "Tugu Jogja",
                "Wisata ke 1"
            ),
            Wisata(
                R.drawable.labuanbajo,
                "Labuan Bajo",
                "Wisata ke 2"
            ),
            Wisata(
                R.drawable.rinjani,
                "Gunung Rinjani",
                "Wisata ke 3"
            ),
            Wisata(
                R.drawable.prambanan,
                "Candi Prambanan",
                "Wisata ke 4"
            )

        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_anggota)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = Wisata_Adapter(this, anggotaList){
            val intent = Intent (this, DetailWisataActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}