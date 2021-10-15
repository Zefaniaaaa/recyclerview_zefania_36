package com.example.recyclerview_zefania_36

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Wisata(
    val imgAnggota: Int,
    val namaAnggota: String,
    val descAnggota: String,
) : Parcelable
