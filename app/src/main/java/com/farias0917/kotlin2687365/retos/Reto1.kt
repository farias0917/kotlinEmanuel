package com.farias0917.kotlin2687365.retos

class Reto1 {
}

fun main(){

    println("---REGLAS DEL JUEGO---")
    println("Ganas si sacas un par de unos en los dados")
    println("Ganas si sacas un total de tres en los dados")
    println("Ganas si sacas un total de once en los dados")
    print("Ganas si sacas un total de dos o doce en los dados")
    print("Ganas si sacas un total de 7 en los dados")
    print("Pierdes si obtienes un resultado diferente a los mencionados ")
    println("Lanzamineto del primer dado")
    print("")
    var dado1:Int = (1..6).random()
    println("dado 1: $dado1")

    println("Lanzamineto del segundo dado")
    var dado2:Int = (1..6).random()
    println("dado 2: $dado2")

    var sumaDados:Int = dado1 + dado2

    if (dado1 == 1 && dado2 ==1){
        print("HAS GANADO! :)")
    }else if(sumaDados == 3 || sumaDados == 11 || sumaDados ==  2 || sumaDados == 12 || sumaDados == 7){
        println("la suma de los dados es $sumaDados")
        println("HAS GANADO! :)")
    }else{
        println("la suma de los dados es $sumaDados")
        println("HAS PERDIDO SUERTE PARA LA PROXIMA :(")
    }
}