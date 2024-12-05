package com.aysenurgokce.kotlinoop

class VadesizHesap(hesapNo: String, bakiye: Double) : BankaHesabi(hesapNo, bakiye) {
    override fun faizHesapla(): Double {
        println("Vadesiz hesaplarda faiz yok.")
        return 0.0
    }
    // Vadesiz hesaba özel işlemler
    fun ekstreGoruntule() {
        println("Hesap ekstresi görüntüleniyor...")
    }

}