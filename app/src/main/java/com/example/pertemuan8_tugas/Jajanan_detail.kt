package com.example.pertemuan8_tugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.jajanan_detail.*

class Jajanan_detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.jajanan_detail)

        var intent_from_jajanandetail = getIntent()

        if(intent_from_jajanandetail.hasExtra("nama_jajanan")){

            var gambar_jajanan = intent_from_jajanandetail.getIntExtra("gambar_jajanan", 0)
            var nama_jajanan = intent_from_jajanandetail.getStringExtra("nama_jajanan")
            var harga_jajanan = intent_from_jajanandetail.getIntExtra("harga_jajanan",0)
            var alamat_jajanan = intent_from_jajanandetail.getStringExtra("alamat_jajanan")
            var deskripsi_jajanan = intent_from_jajanandetail.getStringExtra("deskripsi_jajanan")

            iv_detail_gambarjajanan.setImageResource(gambar_jajanan)
            tv_detail_namajajanan.text = nama_jajanan
            tv_detail_harga.text = harga_jajanan.toString()
            tv_detail_alamat.text = alamat_jajanan
            tv_detail_deskripsi.text = deskripsi_jajanan

        }

    }
}