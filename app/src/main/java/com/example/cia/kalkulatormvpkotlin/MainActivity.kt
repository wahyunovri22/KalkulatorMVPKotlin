package com.example.cia.kalkulatormvpkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {


    lateinit var presenter : HitungPresenterImp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPresenter()
        initView()
    }

    override fun kosong() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        Toast.makeText(this, "jangan kosong", Toast.LENGTH_SHORT).show()
    }

    override fun hasil(nilai: String) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        txt_hasil.text = nilai
    }

    private fun initPresenter() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        presenter = HitungPresenterImp(this)
    }

    private fun initView() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        btn_tambah.setOnClickListener {
            presenter.hitungTambah(edt_angka1,edt_angka2)

        }
        btn_kurang.setOnClickListener {
            presenter.hitungKurang(edt_angka1, edt_angka2)
        }
        btn_kali.setOnClickListener {
            presenter.hitungKali(edt_angka1,edt_angka2)
        }
        btn_bagi.setOnClickListener {
            presenter.hitungBagi(edt_angka1,edt_angka2)
        }

    }
}
