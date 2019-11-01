package com.rogoznyak.rx

import java.lang.Exception

enum class Color (
        var r: Int, val g: Int, val b:Int
)
{
    RED(255,0,0),ORANGE(255,165,0),
    YELLOW(255,255,0), GREEN(0,255,0), BLUE(0,0,255),
    INDIGO(75,0,130),VIOLET(238,130,238);

    fun getMnemonic() =
            when (this) {
                Color.RED -> "Каждый"
                Color.ORANGE -> "Охотник"
                Color.YELLOW -> "Желает"
                Color.GREEN -> "Знать"
                Color.BLUE -> "Где"
                Color.INDIGO -> "Сидит"
                Color.VIOLET -> "Фазан"
            }

    fun getWarmth() = when(this) {
        RED, ORANGE, YELLOW -> "Теплый"
        GREEN -> "Нейтральный"
        BLUE,INDIGO,VIOLET -> "Холодный"
    }
}

fun mix(c1: Color,c2:Color)=
        when (setOf(c1,c2)){
            setOf(Color.RED,Color.YELLOW) -> Color.ORANGE
            setOf(Color.YELLOW,Color.BLUE) -> Color.GREEN
            setOf(Color.BLUE,Color.VIOLET) -> Color.INDIGO
            else -> throw Exception("Грязный цвет")

        }