package com.farias0917.kotlin2687365.ejercicios

class Arrays {
}

fun main(){
    var pets = arrayOf("dog","cat","canary")
    //Cambiar el elemento de una posicion
    pets[2]="parrot"

    println(pets.contentToString())

    //Imprimir una posicion especifica
    println(pets[1])

    //Recorrer el arreglo por medio de un ciclo
    for ((index,element) in pets.withIndex()){
        println("La mascota No. $index es $element")
    }

    //LISTAS
    val instrumentos = listOf("trumpet","piano","violin")
    println(instrumentos)

    val instrumentos2 = mutableListOf("trumpet","piano","violin")
    instrumentos2[2]="Guitarra"
    println(instrumentos2)

    //Acceder al primer valor
    println(instrumentos2.get(0))

    //Acceder al último valor
    println(instrumentos2.get(instrumentos2.lastIndex))

    //Agregar elementos a la lista mutable
    instrumentos2.add(0,"acordeon")
    instrumentos2.add(1,"flauta")
    instrumentos2.add(2,"bateria")
    instrumentos2.add(3,"clarinete")
    println(instrumentos2)

    //Eliminar elementos a la lista mutable
    instrumentos2.remove(instrumentos2[1])
    println(instrumentos2)

    instrumentos2.removeFirst()
    instrumentos2.removeLast()

    println(instrumentos2)

    val ejemplo= mutableListOf(1,2,2,2,3,4,5,6)
    println(ejemplo)
    ejemplo.removeAll(setOf(2))
    println("Funados los numeros 2: $ejemplo")

    //Eliminar un elemento que no existe

    /*instrumentos2.removeAt(3)
     println(instrumentos2)*/

    //Si se elimina un elemento que no existe, genéra error

    //Eliminar elementos de una lista a través del index
    instrumentos2.removeAt(1)
    println(instrumentos2)

    //Eliminar una lista completa
    instrumentos2.clear()
    println(instrumentos2)
}