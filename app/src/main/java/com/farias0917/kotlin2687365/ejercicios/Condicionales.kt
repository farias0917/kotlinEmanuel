package com.farias0917.kotlin2687365.ejercicios

class Condicionales {
}

fun main(){
    println("Ingrese el primer número")
    var num1:Int = readLine()!!.toInt()
    println("Ingrese el segundo número")
    var num2:Int = readLine()!!.toInt()

    if (num1 > num2){
        //Si se cumple
        print("El mayor es ${num1}")
    }else if (num1 < num2){
        //Si no se cumplew
        print("El mayor es ${num2}")
    }else{
        print("Ambos numeros son iguales")
    }
}