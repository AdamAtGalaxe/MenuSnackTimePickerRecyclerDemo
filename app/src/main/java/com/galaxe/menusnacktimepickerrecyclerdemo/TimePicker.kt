package com.galaxe.menusnacktimepickerrecyclerdemo

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.util.*

class TimePicker : AppCompatActivity() {
    lateinit var changeTime: Button
    lateinit var clock: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker)

        changeTime = findViewById(R.id.change)
        clock = findViewById(R.id.clock)
        val current = Calendar.getInstance()
        clock.text = SimpleDateFormat("HH:mm").format(current.time)
    }
    fun setTime(v: View){
        changeTime.setOnClickListener {

            var cal = Calendar.getInstance()

            var timeSetListener = TimePickerDialog.OnTimeSetListener { view, h, m ->
                cal.set(Calendar.HOUR_OF_DAY, h)
                cal.set(Calendar.MINUTE, m)
                clock.text = SimpleDateFormat("HH:mm").format(cal.time)
            }
            //TimePickerDialog(this, timeSetListener, cal.get)
            TimePickerDialog(this, timeSetListener, cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), false).show()
        }
    }
}