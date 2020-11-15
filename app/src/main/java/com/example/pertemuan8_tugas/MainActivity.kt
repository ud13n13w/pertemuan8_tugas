package com.example.pertemuan8_tugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private fun createJajanan() : List<Jajanan>{

        val data_jajanan = ArrayList<Jajanan>()
        data_jajanan.add(Jajanan(R.drawable.spikoe, "Spikoe", 80000, "Jl. Rungkut Madya 41",
            "Keistimewaan lain dari kue lapis khas Surabaya ini adalah semuanya dibuat dengan bahan-bahan berkualitas tinggi." +
                            " Meski memakai resep tradisional, tapi semua bahan dan peralatan sudah modern. Dijamin aman dan halal! Kamu bisa memilih rasa" +
                            " atau isian di dalam kue. Ada yang original, memakai kismis, buah prem kering, dan juga varian speculaas."))
        data_jajanan.add(Jajanan(R.drawable.bebekdjangkep, "Bebek Djangkep", 80000, "Jl. Tidar No. 20 B, Sawahan",
            "Kamu cukup menggoreng bebek atau ayam yang sudah kamu beli sesuai selera, biasanya sampai berwarna coklat keemasan. " +
                            "Ada dua varian rasa yang bisa kamu pilih; bumbu kuning khas Madura atau bumbu betutu khas Bali. Selain higienis dan lezat," +
                            " Bebek Djangkep juga sudah memiliki sertifikat halal. Oleh-oleh khas Surabaya ini pas banget dijadikan buah tangan buat yang doyan" +
                            " makan bebek dengan bumbu tradisional."))
        data_jajanan.add(Jajanan(R.drawable.snowcake, "Snowcake", 60000, "Jl. Flores No. 15, Ngagel",
            "Nama snowcake didapat dari taburan gula halus yang ada di bagian atas kue, membuatnya seolah diselimuti salju. " +
                            "Teksturnya yang beragam juga memberikan kenikmatan tersendiri bagi yang melahap kue ini. Varian rasanya beragam, kamu bisa memilih rasa" +
                            " caramel, vanilla, choco green tea, choco banana, dan keju. Tapi, kue ini harus cepat dimakan ya, karena daya tahannya tidak terlalu lama."))
        data_jajanan.add(Jajanan(R.drawable.bunarendang, "Bunarendang", 10000, "Jl. Manyar Sambongan No.40 D, Kertajaya",
            "Oleh-oleh khas Surabaya ini diciptakan oleh mahasiswa ITS dan dijual di beberapa lokasi di sekitar kampus. Meski bahan utamanya" +
                            " adalah nasi dan rendang yang mirip masakan padang, namun Bunarendang juga merupakan makanan cepat saji layaknya hamburger. Kamu bisa" +
                            " beli makanan ini dan membawanya pulang. Panaskan di microwave dan nikmati selagi panas atau hangat."))
        data_jajanan.add(Jajanan(R.drawable.bikangpeneleh, "Bikang Peneleh", 7000, "Jl. Peneleh No.32-34, Peneleh, Genteng",
            "Bikang Peneleh memiliki keistimewaan karena meski dibuat dari bahan yang biasa saja (tepung, gula, dan santan), " +
                            "tapi rasanya sangat legit. Warna-warni dari kue ini didapat dari daun pandan atau cokelat bubuk. Teksturnya renyah di bawah" +
                            " dan lembut di atas. Jajanan ini juga memiliki banyak varian rasa, mulai dari pandang hingga cokelat"))
        data_jajanan.add(Jajanan(R.drawable.sangpisang, "SangPisang", 20000, "Jl. Raya Tenggilis",
            "Kaesang, anak bungsu pak Jokowi ini pada tahun 2017 merintis usaha pisang nugget miliknya sendiri. Ia tidak mau disebut" +
                            " dengan kue artis karena olahannya adalah pisang. Setelah membuka 11 cabang di kota besar Indonesia, ia membuka cabang di Surabaya." +
                            " Untuk tambahan topping kalian bisa merogoh kocek 5 ribu saja. Salah satu menu favorit adalah Sang Pisang Green Tea Oreo"))
        data_jajanan.add(Jajanan(R.drawable.churrocruzt, "Churro Cruzt", 15000, "Galaxy Mall 1, Lantai 2, Jl. Dharmahusada Indah Timur No. 35",
            "Churro merupakan adonan tepung yang sudah memiliki rasa dasar dan biasa ditambahkan dengan toping coklat. Anda " +
                            "bisa memilih bahan dasar tepung dengan berbagai macam rasa seperti coklat, strawberry, greentea, dan oreo. Untuk " +
                            "toppingnya, Churro Cruzt menyediakan seperti saus dengan macam rasa dan juga topping marshmellow atau crispy rice."))
        data_jajanan.add(Jajanan(R.drawable.shihlin, "Shihlin", 43000, "Tunjungan Plaza 3, Lantai Lower Ground , Jl. Basuki Rahmat No. 8 - 12",
            "Sebagai salah satu family mall  di Surabaya, Tunjungan Plaza memang menawarkan banyak tempat makan yang nyaman untuk" +
                            " keluarga. Tak hanya itu, jajanan enak yang pas untuk cemal-cemil juga banyak. Salah satunya Shihlin Taiwan " +
                            "Snack yang menawarkan sajian dada ayam tanpa tulang yang digoreng dengan tepung khas Taiwan. Rasanya lezat" +
                            " dengan campuran rempah khas oriental yang bikin kamu tak mau bagi-bagi."))

        return data_jajanan
    }

    private fun itemJajananClicked(data_jajanan : Jajanan){

        val intent_to_jajanandetail = Intent(this, Jajanan_detail::class.java)
        intent_to_jajanandetail.putExtra("gambar_jajanan", data_jajanan.gambar_jajanan)
        intent_to_jajanandetail.putExtra("nama_jajanan", data_jajanan.nama_jajanan)
        intent_to_jajanandetail.putExtra("harga_jajanan", data_jajanan.harga_jajanan)
        intent_to_jajanandetail.putExtra("alamat_jajanan", data_jajanan.alamat_jajanan)
        intent_to_jajanandetail.putExtra("deskripsi_jajanan", data_jajanan.deskripsi_jajanan)

        startActivity(intent_to_jajanandetail)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_jajanan.layoutManager = LinearLayoutManager(this)
        rv_jajanan.setHasFixedSize(true)

        val createJajanan = createJajanan()
        rv_jajanan.adapter = Adapter_jajanan(createJajanan, {Jajanan : Jajanan -> itemJajananClicked(Jajanan)})

    }
}