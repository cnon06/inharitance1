package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


open class geometrik_sekil {

    var en=0
    var boy=0


   open fun alan_hesapla()
    {

        println("Geometrik şeklin alanı: ${en*boy}")
    }


}

class kare: geometrik_sekil() {


   override fun alan_hesapla()
    {
        println("Karenin alanı: ${en*en}")
    }

}


class dikdortgen: geometrik_sekil() {


    override fun alan_hesapla()
    {
        super.alan_hesapla()
        println("Dikdörtgenin alanı: ${en*boy}")
    }

}


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var d1 = dikdortgen()
        d1.en=5
        d1.boy=6
        d1.alan_hesapla()


     var k1 = kare()
        k1.en=5
        k1.alan_hesapla()

    }
}