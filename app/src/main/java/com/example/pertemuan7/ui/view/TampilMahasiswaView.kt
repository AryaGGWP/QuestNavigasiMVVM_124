package com.example.pertemuan7.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily.Companion.Cursive
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pertemuan7.model.Mahasiswa

@Composable
fun TampilMahasiswaView(
    dataMhs: Mahasiswa,
    onBackClick: () -> Unit
){
    Column(modifier = Modifier.fillMaxSize().
        padding(8.dp)
    ) {
        TampilData(
            judul = "Nama",
            isi = dataMhs.nama
        )
        TampilData(
            judul = "NIM",
            isi = dataMhs.nim
        )
        TampilData(
            judul = "E-mail",
            isi = dataMhs.email
        )
        TampilData(
            judul = "Nomor HP",
            isi = dataMhs.noHp
        )
        TampilData(
            judul = "Jenis Kelamin",
            isi = dataMhs.gender
        )
        TampilData(
            judul = "ALamat",
            isi = dataMhs.alamat
        )
        Button(
            onClick = onBackClick,
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
        ) {
            Text(text = "Kembali")
        }
    }
}

@Composable
fun TampilData(
    judul: String, isi: String
) {
    Column(modifier = Modifier.padding(16.dp))
    {
        Row(
            modifier = Modifier.fillMaxWidth()
            , horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = judul,
                modifier = Modifier.weight(0.8f),
                fontSize = 14.sp
            )
            Text(
                text = ":",
                modifier = Modifier.weight(0.2f),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = isi,
                modifier = Modifier.weight(2f),
                fontWeight = FontWeight.Bold,
                fontFamily = Cursive
            )
        }
    }
}