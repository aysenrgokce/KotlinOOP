package com.aysenurgokce.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        fun main() {
            // Vadesiz Hesap
            val vadesizHesap: HesapIslemleri = VadesizHesap("12345", 1000.0)
            vadesizHesap.paraYatir(500.0)
            vadesizHesap.paraCek(200.0)
            vadesizHesap.hesapBilgileriniGoster()

            println("-------------")

            // Vadeli Hesap
            val vadeliHesap: BankaHesabi = vadeliHesap("67890", 5000.0, 5.0)
            vadeliHesap.paraYatir(1000.0)
            vadeliHesap.paraCek(300.0)
            vadeliHesap.faizHesapla()
            vadeliHesap.hesapBilgileriniGoster()
        }


        //Lambda Gösterimi
        //val lambdaAdi: (GirdiTipleri) -> CiktiTipi = { girdiler -> işlem }


        //Normal Fonksiyon;
        fun toplama(a: Int, b: Int): Int {
            return a + b
        }
        println(toplama(5, 3)) // Çıktı: 8

        //lambda ile gösterim
        val toplama: (Int, Int) -> Int = { a, b -> a + b }
        println(toplama(5, 3)) // Çıktı: 8

        /*(Int, Int) -> Int: Lambda’nın aldığı parametrelerin türü ve dönüş tipi.
         { a, b -> a + b }: Lambda’nın işlemi. a ve b parametreleri toplanıyor.*/

        // callback fonksiyonu:
        fun dosyaYukle(dosyaAdi: String, tamamlandi: (String) -> Unit) {
            println("$dosyaAdi yükleniyor...")
            // Yükleme tamamlandıktan sonra callback'i çağırır
            tamamlandi("$dosyaAdi başarıyla yüklendi!")
        }

        /*fun main() {
            dosyaYukle("resim.jpg") { sonuc ->
                println(sonuc) // Çıktı: resim.jpg başarıyla yüklendi!
            }
        }*/


        //Listener Fonksiyonu
        class Buton {
            var tiklamaDinleyici: (() -> Unit)? = null

            fun tikla() {
                println("Buton tıklandı!")
                tiklamaDinleyici?.invoke() // Dinleyiciyi çağır
            }
        }

        /*fun main() {
            val buton = Buton()
            buton.tiklamaDinleyici = {
                println("Buton dinleyicisi çalıştı!") // Çıktı: Buton dinleyicisi çalıştı!
            }
            buton.tikla()
        }*/

        //Completion (Tamamlama) Fonksiyonu
        fun veriGetir(apiUrl: String, tamamlandi: (String?) -> Unit) {
            println("$apiUrl adresine istek gönderiliyor...")
            // Simüle edilmiş bir işlem
            val sonuc = "Veri başarıyla alındı!"
            tamamlandi(sonuc) // Tamamlandı fonksiyonunu çağır
        }

        /*fun main() {
            veriGetir("https://api.example.com") { sonuc ->
                println(sonuc) // Çıktı: Veri başarıyla alındı!
            }
        }*/






    }
}