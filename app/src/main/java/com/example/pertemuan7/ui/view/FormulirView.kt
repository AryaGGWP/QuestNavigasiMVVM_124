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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FormulirView(
    modifier: Modifier = Modifier,
    pilihanJK: List<String>,
    onClickButton: (MutableList<String>) -> Unit


){
    var nama by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var noHp by remember { mutableStateOf("") }
    var nim by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenisK by remember { mutableStateOf("") }
    val listData: MutableList<String> = mutableListOf(
        nama, nim, email, noHp, alamat, jenisK
    )


    Column(modifier = modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Biodata",
            fontSize = 28.sp
            , fontWeight = FontWeight.Bold)
        Spacer(Modifier.padding(16.dp))
        TextField(
            value = nama,
            onValueChange = {nama = it},
            label = {Text("nama")},
            placeholder = {Text("Masukkan Nama Anda")},
            modifier = Modifier.fillMaxWidth().padding(5.dp)
        )
        TextField(
            value = nim,
            onValueChange = {nim = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            label = { Text(text = "nim") },
            placeholder = { Text("Masukkan NIM Anda", color = Color.Gray)
            }
        )

        Row {
            pilihanJK.forEach{selectedJK ->
                Row(verticalAlignment = Alignment.CenterVertically) { RadioButton(
                    selected = jenisK == selectedJK,
                    onClick = {
                        jenisK = selectedJK
                    }
                )
                    Text(selectedJK)
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
            value = noHp,
            onValueChange = {noHp = it},
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
            onClickButton(listData)}, Modifier.padding(vertical = 10.dp))
        {
            Text("Submit")
        }
    }
}

