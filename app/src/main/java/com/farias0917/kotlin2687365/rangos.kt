package com.farias0917.myapp2687365

class rangos {
}

fun main(){
    /*println("Ingrese un número de 1 a 20")
    var numero: Int = readLine()!!.toInt()

    if (numero in 1..20){
        print("Perfecto, el número esta dentro del rango")
    }else{
        print("Te dije que un número de 1 a 20 -_-")
    }*/

    //Numeros aleatorios
    var result:Int = (1..50).random()//Generar números aleatorios

    println("El número aleatorio es $result")
    when(result){
        0 -> print("No hay resultados")
        1,2,3,4,5-> print("Hay menos de 5 resultados")
        in 6..58 -> println("Hay entre 5 y 50 resultados")
        else-> print("Esos son bastantes resultados")
    }
}