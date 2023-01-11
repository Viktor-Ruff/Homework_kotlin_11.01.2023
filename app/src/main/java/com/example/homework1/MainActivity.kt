package com.example.homework1

import android.annotation.SuppressLint
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weather = Weather()
        val tvResult: TextView = findViewById(R.id.tv_result)
        val tvJapanWeather: TextView = findViewById(R.id.tv_japan_weather)
        val btProperties: Button = findViewById(R.id.bt_result)

        btProperties.setOnClickListener() {
            tvResult.text =
                "SPB - temperature: ${weather.temperature}, type: ${weather.typeWeather}"
            tvJapanWeather.text =
                "Japan - temperature: ${JapanWeather.temperature}, type: ${JapanWeather.typeWeather}"

            Log.d("Hello", "temperature: ${weather.temperature}, type: ${weather.typeWeather}")
        }

        printMoscowWeather()

        val weatherList: List<Weather> = listOf(
            Weather(8),
            Weather(37),
            Weather(-15, "snowy")
        )

        for (temperature in weatherList) {
            println(temperature.temperature)
        }

        for (i in weatherList.indices) {
            println(weatherList[i].typeWeather)
        }
    }
}