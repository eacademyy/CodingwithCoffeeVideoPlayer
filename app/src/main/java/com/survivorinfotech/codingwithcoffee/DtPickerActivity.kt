package com.survivorinfotech.codingwithcoffee

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.icu.util.Calendar
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DtPickerActivity : AppCompatActivity() {
    lateinit var tvDateTime: TextView
    lateinit var btnDatePicker: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dt_picker)

        tvDateTime = findViewById(R.id.tvDateTime)
        btnDatePicker = findViewById(R.id.btnDatePicker)

        btnDatePicker.setOnClickListener {
            ShowDateTimePicket()
        }
    }

    private fun ShowDateTimePicket() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog(this,
            {_,selectedYear,selectedMonth,selectedDay->
                val selectedDate = "$selectedDay/${selectedMonth+1}/$selectedYear"
                val hour = calendar.get(Calendar.HOUR_OF_DAY)
                val minute = calendar.get(Calendar.MINUTE)

                TimePickerDialog(this,
                    {
                        _,selectedHour,selectedMin->
                        val selectedTime = "$selectedHour:$selectedMin"
                        tvDateTime.text = "Selected Date and time : $selectedDate $selectedTime"
                    },hour,minute,false).show()

            },year,month,day).show()

    }
}