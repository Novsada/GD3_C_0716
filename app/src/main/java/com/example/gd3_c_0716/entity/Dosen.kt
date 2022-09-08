package com.example.gd3_c_0716.entity

class Dosen(var name: String, var pengajar: String) {
    companion object{
        var listOfDosen= arrayOf(
            Dosen("Fedelis Brian", "Pengajar Kelas A,S, dan D"),
            Dosen("Thomas Adi","Pengajar Kelas C")

        )
    }
}