package com.example.latihanrecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihanrecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listNewsData = arrayListOf(
            ListNews("Poin-poin Substansi Mahfud MD soal Transaksi Jangggal Rp349T", "30 Maret 2023", "Politik", R.drawable.md),
            ListNews("Gibran Kelas Piala Dunia U-20 Terancam Batal", "29 Maret 2023", "Peristiwa", R.drawable.gbrn),
            ListNews("Efek Timnas Israel, Elektabilitas Ganjar-PDIP Bisa Dilumat Tifosi Bola", "30 Maret 2023", "Politik", R.drawable.gnjr),
            ListNews("Sandiaga Uno Puji Fitur Baru PUBGM, World of Wonder", "28 Maret 2023", "Esport", R.drawable.pbg),
            ListNews("Waketum PSSI Masih Berharap Timnas U-20 Main di Piala Dunia U-20", "30 Maret 2023", "Sport", R.drawable.hg),
            ListNews("Cuitan Elon Musk Bikin Bos ChatGPT Sakit Hati", "30 Maret 2023", "Technology", R.drawable.gpt),
            ListNews("Nokia Akan Bawa Jaringan 4G ke Bulan Tahun Ini", "30 Maret 2023", "Technology", R.drawable.nka),
            ListNews("Fitur Jajak Pendapat Twitter Hanya Diizinkan Buat Akun Verified", "30 Maret 2023", "Technology", R.drawable.tw),
            ListNews("Xi Jinping Tak Lagi Gencet Jack Ma, Ini Buktinya", "30 Maret 2023", "Technology", R.drawable.frr),
            ListNews("Elon Musk dkk minta Pengembangan AI Ditunda Karena Berbahaya", "30 Maret 2023", "Technology", R.drawable.ddw),
        )

        val adapterNews = NewsAdapter(listNewsData)

        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        binding.rvNews.layoutManager = lm
        binding.rvNews.adapter = adapterNews
    }

}