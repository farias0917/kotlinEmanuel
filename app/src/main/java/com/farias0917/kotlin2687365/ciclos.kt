package com.farias0917.kotlin2687365

class ciclos {
}

fun main(){
    /*for (i in 1..5) println(i)
    println()

    for (i in 5 downTo 1 ) println(i)
    println()

    for (i in 1 .. 5 step 2) println(i)
    println()

    //ejercicio
    //poedir 6 numeros al usuario y decir si es para o impar


    var par:Int = 0
    var impar:Int = 0
    var acuPar:Int = 0
    var acuImpar:Int = 0
    for (i in 1..6){
        println("Ingrese el número ${i}")
        var num:Int = readLine()!!.toInt()

        var resultado:Int = num % 2;
        if (resultado == 0){
            println("Es par")
            par=par + 1
            acuPar = acuPar + num

        }else{
            println("es impar")
            impar=impar + 1
            acuImpar = acuImpar + num
        }
    }

    println("hay ${par} números pares")
    println("la suma de los números pares es de ${acuPar}")
    println()
    println("hay ${impar} números impares")
    println("la suma de los números impares es de ${acuImpar}")

    for (i in 'a'..'f')print(i)*/

    //-----CICLO WHILE//

    /*var par:Int = 0
    var impar:Int = 0
    var acuPar:Int = 0
    var acuImpar:Int = 0
    var continuar = "si"
    while (continuar == "si"){
        println("Ingrese el número")
        var num:Int = readLine()!!.toInt()

        var resultado:Int = num % 2;
        if (resultado == 0){
            println("Es par")
            par=par + 1
            acuPar = acuPar + num

        }else{
            println("es impar")
            impar=impar + 1
            acuImpar = acuImpar + num
        }

        println("¿Desea volver a empezar?")
        continuar = readLine()!!.toString()
    }

    println("hay ${par} números pares")
    println("la suma de los números pares es de ${acuPar}")
    println()
    println("hay ${impar} números impares")
    println("la suma de los números impares es de ${acuImpar}")*/

    //----CICLO DO WEHILE---//


    var par:Int = 0
    var impar:Int = 0
    var acuPar:Int = 0
    var acuImpar:Int = 0
    var continuar = "si"
    do {
        println("Ingrese el número")
        var num:Int = readLine()!!.toInt()

        var resultado:Int = num % 2;
        if (resultado == 0){
            println("Es par")
            par=par + 1
            acuPar = acuPar + num

        }else{
            println("es impar")
            impar=impar + 1
            acuImpar = acuImpar + num
        }

        println("¿Desea volver a empezar?")
        continuar = readLine()!!.toString()
    }while (continuar == "si")
    println("hay ${par} números pares")
    println("la suma de los números pares es de ${acuPar}")
    println()
    println("hay ${impar} números impares")
    println("la suma de los números impares es de ${acuImpar}")
}