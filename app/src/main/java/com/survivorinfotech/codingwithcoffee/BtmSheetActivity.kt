package com.survivorinfotech.codingwithcoffee

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomsheet.BottomSheetDialog

class BtmSheetActivity : AppCompatActivity() {
    lateinit var btnOpen: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btm_sheet)

        btnOpen = findViewById(R.id.btnOpen)

        btnOpen.setOnClickListener {
            showBottomSheet()
        }
    }

    @SuppressLint("MissingInflatedId")
    private fun showBottomSheet() {
        val btmBottomSheetDialog = BottomSheetDialog(this)

        val view = LayoutInflater.from(this).inflate(R.layout.layout_bottom_sheet,null)
        val btnClose = view.findViewById<Button>(R.id.btnClose)

        btnClose.setOnClickListener {
            btmBottomSheetDialog.dismiss()
        }

        btmBottomSheetDialog.setContentView(view)
        btmBottomSheetDialog.show()
    }
}