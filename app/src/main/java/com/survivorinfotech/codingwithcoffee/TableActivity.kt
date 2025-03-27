package com.survivorinfotech.codingwithcoffee

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.setPadding

class TableActivity : AppCompatActivity() {
    lateinit var tblLayoutScoreCard: TableLayout
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table)

        tblLayoutScoreCard = findViewById(R.id.tblLayoutScoreCard)

        val tableRow = TableRow(this)

        val textView1 = TextView(this)

        textView1.text = "Virat Kohli"
        textView1.setPadding(8,8,8,8)

        val textView2 = TextView(this)

        textView2.text = "129*"
        textView2.setPadding(8,8,8,8)


        tableRow.addView(textView1)
        tableRow.addView(textView2)

        tblLayoutScoreCard.addView(tableRow)

    }
}