package com.aysenurgokce.kotlinoop

abstract class BankaHesabi(private val hesapNo: String, protected var bakiye: Double) : HesapIslemleri {
    private var hesapSahibi: String = "Bilinmiyor"

    override fun hesapBilgileriniGoster() {
        println("Hesap No: $hesapNo, Bakiye: $bakiye TL")
    }
    // Soyut metod: Her hesap türü kendi faiz oranını ve işlem özelliklerini belirleyecek

    abstract fun faizHesapla():Double

    override fun paraYatir(tutar:Double){
        if(tutar>0){
            bakiye += tutar
            println("$tutar tutarında hesabınıza para yatırıldı. Yeni bakiyeniz: $bakiye")
        }else{
            println("geçersiz tutar")
        }
    }

    override fun paraCek(tutar: Double){
        if(tutar <= bakiye){
            bakiye -= tutar
            println("$tutar tutarında para çekildi. Yeni bakiyeniz: $bakiye")
        }else{
            println("Yetersiz bakiye!")
        }
    }

}