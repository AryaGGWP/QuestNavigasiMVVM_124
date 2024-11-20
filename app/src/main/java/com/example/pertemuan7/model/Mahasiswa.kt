package com.example.pertemuan7.model

import android.provider.ContactsContract.CommonDataKinds.Email

data class Mahasiswa (
    val nama: String = "",
    val nim: String = "",
    val email: String = "",
    val gender: String = "",
    val alamat: String = "",
    val noHp: String = ""
)
