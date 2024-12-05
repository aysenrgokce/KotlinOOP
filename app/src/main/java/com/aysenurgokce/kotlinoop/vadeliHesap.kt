package com.aysenurgokce.kotlinoop

class vadeliHesap(
    hesapNo: String,
    bakiye: Double,
    private val faizOrani: Double
) : BankaHesabi(hesapNo, bakiye) {

    override fun faizHesapla(): Double {
        val faiz = bakiye * faizOrani / 100
        println("Vadeli hesap faizi: $faiz TL")
        return faiz
    }

    fun VadeSonrasıcekim(){
        println("Vade sonrası ğpara çekimi yapılabilir")
    }
}