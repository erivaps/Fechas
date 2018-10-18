package com.kotlin.fechas.fechas

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TimePicker
import kotlinx.android.synthetic.main.activity_main.*
import java.time.DayOfWeek
import java.time.Month
import java.time.Year
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cambiarFecha(view: View){
        var c = Calendar.getInstance()
        var dia = c.get(Calendar.DAY_OF_MONTH)
        var mes = c.get(Calendar.MONTH)
        var anio = c.get(Calendar.YEAR)
        val datePicker =  DatePickerDialog(this,
                android.R.style.ThemeOverlay,
                DatePickerDialog.OnDateSetListener{DatePicker,
                        Year,Month, Day ->
        txtFecha.text = "$Day / ${Month+1} / $Year"},
                anio, mes, dia

        )
        datePicker.show()
    }

    fun cambiarHora(view: View){
        var c = Calendar.getInstance()
        var hora = c.get(Calendar.HOUR_OF_DAY)
        var minutos = c.get(Calendar.MINUTE)

        var timePicker = TimePickerDialog(this,
                TimePickerDialog.OnTimeSetListener{
                        TimePicker,hour,minute ->
                    txtHora.text = "$hour: $minute"},
                        hora, minutos, true
        )

        timePicker.show()


    }
}
