package com.example.pertemuan7.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily.Companion.Cursive
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pertemuan7.model.Mahasiswa

@Composable
fun DetailMahasiswaView(
    dataMhs: Mahasiswa
){
    val listDataMhs = listOf(
        Pair("Nama", dataMhs.nama),
        Pair("Gender", dataMhs.gender),
        Pair("Alamat", dataMhs.alamat)
    )
    Column(modifier = Modifier.fillMaxSize().
        padding(16.dp)
    ) {
        listDataMhs.forEach { data ->
            DetailMessage(judul = data.first,
                isi = data.second)
        }
    }
}

@Composable
fun DetailMessage(
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
                modifier = Modifier.weight(0.3f),
                fontSize = 14.sp
            )
            Text(
                text = ":",
                modifier = Modifier.weight(0.2f),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = isi,
                modifier = Modifier.weight(0.9f),
                fontWeight = FontWeight.Bold,
                fontFamily = Cursive
            )
        }
    }
}