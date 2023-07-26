package com.farias0917.kotlin2687365.ejercicios

class Introduccion {
}

fun main() {
    var name: String = "Emanuel"
    var long: Long = 1222222222222222233
    var int: Int = 1232111211
    var short: Short = 12321
    var byte: Byte = 11
    var double: Double = 1131.123456789101
    var float: Float = 3.123543F
    var char: Char = '1'
    var boolean: Boolean = true


    val s = "aeiou"
    println("$s.length es ${s.length}")

    println("Ingrese número 1")
    var num1:Int = readLine()!!.toInt()
    println("Ingrese número 1")
    var num2:Int = readLine()!!.toInt()

    print("La suma de los dos numeros es: ${num1.plus(num2)}")

    var valornulo: Int? = null
}