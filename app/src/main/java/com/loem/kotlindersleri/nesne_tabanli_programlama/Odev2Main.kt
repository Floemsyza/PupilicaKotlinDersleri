package com.loem.kotlindersleri.nesne_tabanli_programlama

fun main(){
    val icAci = Odev2()

    icAci.icAcilarToplami(3)

    val maas = Odev2()
    println("Maaş: $maas.maasHesapla(10)")

    val ucret = Odev2()
    println("Ücret: $ucret.ucretHesapla(60)")

    val fahrenhiet = Odev2()
    println("Fahrenhiet: $fahrenhiet.fahrenhiet(37.0)")

    val dikdortgenCevre = Odev2()
    dikdortgenCevre.cevreHesapla(2,3)

    val faktoriyel = Odev2()
    println("Faktöriyel: $faktoriyel.faktoriyel(5)")

    val aHarfi = Odev2()
    aHarfi.aHArfiBul("Loem")
}