package com.example.homework1

/**
 * Created by Viktor-Ruff
 * Date: 11.01.2023
 * Time: 11:10
 */


fun printMoscowWeather() {
    val weather = Weather()
    weather.typeWeather = "rainy"
    weather.temperature = 1
    println("temperature: ${weather.temperature}, type: ${weather.typeWeather}")
}