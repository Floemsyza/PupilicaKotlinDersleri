package com.loem.kotlindersleri.nesne_tabanli_programlama

class Odev2 {

    fun icAcilarToplami(kenarSayisi: Int){
        val icAcilarToplami = (kenarSayisi - 2) * 180
        println("Bir $kenarSayisi kenarlı çokgenin iç açılar toplamı : $icAcilarToplami")

    }

    fun maasHesapla(gunSayisi: Int) : Int{
        var maas = 0
        var mesaiSaat = 0

        if(gunSayisi*8>160){
            mesaiSaat = (gunSayisi*8)-160
        }else{
            mesaiSaat = 0
        }
        maas = (gunSayisi*8)*10 + mesaiSaat*20
        return maas
    }

    fun ucretHesapla(kotaMiktari: Int): Int{
        var ucret = 0
        if(kotaMiktari>50){
            ucret = (kotaMiktari-50)*4 + 100
        }
        return ucret
    }

    fun fahrenhiet(derece: Double): Double{
        val fahrenhiet = (derece * 1.8) + 32
        return fahrenhiet

    }
    fun cevreHesapla(kenarUzunluğu1: Int, kenarUzunluğu2: Int){
        val cevre = (kenarUzunluğu1 + kenarUzunluğu2) * 2
        println("Dikdörtgenin çevresi : $cevre")

    }

    fun faktoriyel(sayi: Int) : Int{
        var sonuc = 1
        for(i in 1..sayi){
            sonuc *= i
        }
        return sonuc
    }

    fun aHArfiBul(kelime: String){
        var sayac = 0
        for(i in kelime){
            if(i == 'a'){
                sayac++
            }
        }
        println("Kelimenin içindeki a harfi sayısı : $sayac")
    }
}