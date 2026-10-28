package com.example.bt_quanlycongviec

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bt_quanlycongviec.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        b.btnthem108.setOnClickListener {
            val ten = b.tencongviec108.text.toString().trim()
            val thoihan = b.thoihan108.text.toString().trim()
            val mota = b.mota108.text.toString().trim()

            if (ten.isNotEmpty())
                Toast.makeText(this, "Nhập tên công việc", Toast.LENGTH_SHORT).show()
            else Toast.makeText(this, "Đã thêm công việc", Toast.LENGTH_SHORT).show()
        }
    }
}