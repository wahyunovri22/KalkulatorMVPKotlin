package com.example.cia.kalkulatormvpkotlin

import android.widget.EditText

/**
 * Created by cia on 17/02/2018.
 */
class HitungPresenterImp : HitungPresenter {

    var modelView: MainView? = null

    constructor(modelView: MainView?) {
        this.modelView = modelView
    }

    override fun hitungKurang(nilai1: EditText, nilai2: EditText) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        var a = nilai1.text.toString()
        var b = nilai2.text.toString()

        if (a.isNotEmpty() && b.isNotEmpty()) {


            var input1 = a.toDouble()
            var input2 = b.toDouble()

            var hasil = input1 - input2

            //masukkan ke mainView
            modelView?.hasil(hasil.toString())

        }else{
            modelView?.kosong()
        }
    }

    override fun hitungKali(nilai1: EditText, nilai2: EditText) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        var a = nilai1.text.toString()
        var b = nilai2.text.toString()

        if (a.isNotEmpty() && b.isNotEmpty()) {


            var input1 = a.toDouble()
            var input2 = b.toDouble()

            var hasil = input1 * input2

            //masukkan ke mainView
            modelView?.hasil(hasil.toString())

        }else{
            modelView?.kosong()
        }
    }

    override fun hitungBagi(nilai1: EditText, nilai2: EditText) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        var a = nilai1.text.toString()
        var b = nilai2.text.toString()

        if (a.isNotEmpty() && b.isNotEmpty()) {


            var input1 = a.toDouble()
            var input2 = b.toDouble()

            var hasil = input1 / input2

            //masukkan ke mainView
            modelView?.hasil(hasil.toString())

        }else{
            modelView?.kosong()
        }
    }



    override fun hitungTambah(nilai1: EditText, nilai2: EditText) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        var a = nilai1.text.toString()
        var b = nilai2.text.toString()

        if (a.isNotEmpty() && b.isNotEmpty()) {


            var input1 = a.toDouble()
            var input2 = b.toDouble()

            var hasil = input1 + input2


            //masukkan ke mainView
            modelView?.hasil(hasil.toString())

        }else{
            modelView?.kosong()
        }
    }
}