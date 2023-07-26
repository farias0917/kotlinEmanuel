package com.farias0917.kotlin2687365.retos

class Reto3 {
}

fun main(){
    var op = "si"
    var buscarAuto:Int = 0
    val carros = mutableListOf("volkswagen","chevrolet","ford","audi","tesla")
    println("---Bienvenido al consecionario---")
    while (op == "si"){
        println("Elija una de las opciones de 1 a 5:")
        println("1.Insertar nuevos autos a la lista")
        println("2.Mostrar todos los datos de la lista")
        println("3.Buscar un carro en particular")
        println("4.Modificar un vheiculo existente")
        println("5.Eliminar un vehiculo existente")
        var eleccionLista:Int = readLine()!!.toInt()
        if (eleccionLista == 1){
            print("Inserta un nuevo auto a la lista: ")
            var carroNuevo = readLine()!!.toString()
            if (carros.any{it==carroNuevo}){
                carros.add(carroNuevo)
                println("Este carro ya se encuentra registrado")
            }else{
                println("DATO AGREGADO CORRECTAMENTE")
            }

        }else if(eleccionLista == 2){
            println("Estos son los carros que hay en la lista: ")
            for ((index,elementos) in carros.withIndex()){
                println("$index. $elementos")
            }
        }else if(eleccionLista == 3){
            println("¿que auto deseas buscar? (Escribe el número del auto)")
            buscarAuto = readLine()!!.toInt()
            println("Has seleccionado ${carros.get(buscarAuto)}")

        }else if(eleccionLista==4){
            print("¿Que auto deseas modificar?")
            buscarAuto = readLine()!!.toInt()
            println("Has seleccionado ${carros.get(buscarAuto)}")
            println("Ingresa el nombre del nuevo auto:")
            var nuevoAuto = readLine()!!.toString()
            carros[buscarAuto] = nuevoAuto
            println("VEHICULO ACTUALIZADO EXITOSAMENTE")

        }else if(eleccionLista == 5){
            println("¿que auto desea eliminar?")
            for ((index,elementos) in carros.withIndex()){
                println("$index. $elementos")
            }
            buscarAuto = readLine()!!.toInt()
            carros.remove(carros[buscarAuto])
            println("EL CARRO SE ELIMINÓ CORRECTAMENTE")
        }
        print("desea continuar")
        op = readLine()!!.toString()
    }
    /*val carros = mutableListOf("volkswagen","chevrolet","ford","audi","tesla")
    println("tenemos la siguiente lista de autos: ")
    for ((index,elementos) in carros.withIndex()){
        println("$index. $elementos")
    }

    print("Inserta un nuevo auto a la lista: ")
    var carroNuevo = readLine()!!.toString()

    carros.add(carroNuevo)

    println("Estos son los carros que hay en la lista: ")
    for ((index,elementos) in carros.withIndex()){
        println("$index. $elementos")
    }

    println("¿que auto deseas buscar?")
    val buscarAuto:Int = readLine()!!.toInt()
    println("Has seleccionado ${carros.get(buscarAuto)}")*/
}