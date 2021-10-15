package com.example.recyclerview_zefania_36

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.recyclerview_ryuzaalysyahputra_29.R

class DetailWisataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_wisata)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val anggota = intent.getParcelableExtra<Wisata>(MainActivity.INTENT_PARCELABLE)

        val imgAnggota = findViewById<ImageView>(R.id.img_item_photo)
        val namaAnggota = findViewById<TextView>(R.id.tv_item_name)
        val detail = findViewById<TextView>(R.id.detailanggota)
        val id = findViewById<EditText>(R.id.inputnama)
        val btn = findViewById<Button>(R.id.buttontampil)

        imgAnggota.setImageResource(anggota?.imgAnggota!!)
        namaAnggota.text = anggota.namaAnggota

        btn.setOnClickListener{
            val input = id.text.toString()
            var hasil = when(input) {
                in "" -> Toast.makeText(applicationContext, "Kata kunci harus di isi", Toast.LENGTH_SHORT).show()
                in "Tugu" -> "Nama : Tugu \n Lokasi : Yogyakarta "
                in "Labuan Bajo" -> "Nama : Labuan Bajo \n Lokasi : NTT"
                in "Gunung Rinjani" -> "Nama : Gunung Rinjani \n Lokasi : Lombok"
                in "Candi Prambanan" -> "Nama : Prambanan \n Lokasi : Sleman"
                else -> Toast.makeText(applicationContext, "Maaf kata kunci yang anda masukan salah", Toast.LENGTH_SHORT).show()
            }
            detail.text = "$hasil"
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}