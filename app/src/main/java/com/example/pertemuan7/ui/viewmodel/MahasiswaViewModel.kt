package com.example.pertemuan7.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.pertemuan7.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel() {
    //only access internal class
    private val _dataModel = MutableStateFlow(Mahasiswa())
    //access for public
    val uiState: StateFlow<Mahasiswa> = _dataModel.asStateFlow()

    fun saveDataMhs(
        listData : MutableList<String>
    ){
        _dataModel.update { data ->
            data.copy(
                nama = listData[0],
                nim = listData[1],
                email = listData[2],
                noHp = listData[3],
                alamat = listData[4],
                gender = listData[5]
            )
        }
    }

}
