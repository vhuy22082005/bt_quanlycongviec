package com.example.bt_quanlycongviec

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bt_quanlycongviec.databinding.ActivityMainBinding
import com.example.bt_quanlycongviec.databinding.DetailActivityBinding

class DetailActivity: AppCompatActivity() {
    private lateinit var b: DetailActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = DetailActivityBinding.inflate(layoutInflater)
        setContentView(b.root)
        enableEdgeToEdge()

        b.btnchinhsua108.setOnClickListener {
            val ten = intent.getStringExtra("ten") ?: ""
            val thoihan = intent.getStringExtra("thoihan") ?: ""
            val mota = intent.getStringExtra("mota") ?: ""

            if(ten.isEmpty())
            Toast.makeText(this, "Thiếu dữ liệu công việc", Toast.LENGTH_SHORT).show()

            if (ten.isNotEmpty()) b.txttencongviec108.text = " Tên công việc : $ten"
            if (thoihan.isNotEmpty()) b.txtthoihan108.text = " Thời hạn : $thoihan"
            if (mota.isNotEmpty()) b.txtmota108.text = " Mô tả : $mota"

        }
        b.btnquaylai108.setOnClickListener { finish() }
    }
}