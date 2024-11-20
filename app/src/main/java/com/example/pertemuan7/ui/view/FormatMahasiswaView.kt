package com.example.pertemuan7.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FormatMahasiswaView(
    modifier: Modifier = Modifier,
    ListGender: List<String>,
    onSubmitClick: (MutableList<String>) -> Unit


){
    var nama by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var noTelpon by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var memilihjk by remember { mutableStateOf("") }

    val listData: MutableList<String> = mutableListOf(
        nama, memilihjk, alamat
    )


    Column(modifier = modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Biodata",
            fontSize = 16.sp
            , fontWeight = FontWeight.Bold)
        Spacer(Modifier.padding(16.dp))
        TextField(
            value = nama,
            onValueChange = {nama = it},
            label = {Text("nama")},
            placeholder = {Text("Masukkan Nama Anda")},
            modifier = Modifier.fillMaxWidth().padding(5.dp)
        )
        Row {
            ListGender.forEach{Unit ->
                Row(verticalAlignment = Alignment.CenterVertically) { RadioButton(
                    selected = memilihjk == Unit,
                    onClick = {
                        memilihjk = Unit
                    }
                )
                    Text(Unit)
                }
            }
        }

        TextField(
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            value = email,
            onValueChange = {email = it},
            label = { Text("E-mail")},
            placeholder = {Text("Masukkan E-mail Anda")}
        )
        TextField(
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            value = noTelpon,
            onValueChange = {noTelpon = it},
            label = { Text("No Telepon")},
            placeholder = {Text("Masukkan Nomor Telepon Anda")}
        )
        TextField(
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            value = alamat,
            onValueChange = {alamat = it},
            label = { Text("Alamat")},
            placeholder = {Text("Masukkan Nama Anda")}
        )

        Button(onClick = {
        }) {
            Text("Submit")
        }
    }
}

