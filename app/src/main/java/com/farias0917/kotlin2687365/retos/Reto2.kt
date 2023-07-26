package com.farias0917.kotlin2687365.retos

class Reto2 {
}

fun main(){

    var op = "si"
    var totalPagar:Int = 0
    var precioProd:Int=0
    var cantidadProd:Int =0
    var acu:Int = 0
    while (op == "si"){
        print("Ingrese precio del producto: ")
        precioProd = readLine()!!.toInt()

        print("Ingrese cantidad del producto: ")
        cantidadProd = readLine()!!.toInt()

        totalPagar += precioProd*cantidadProd


        print("¿Desea Seguir Comprando? ")
        op = readLine()!!.toString()
    }

    if (totalPagar >= 50000){
        println("Tu total a pagar es de ${totalPagar}$")
        var pelota:Int = (1..4).random()
        if (pelota == 1){
            var descuento:Float = totalPagar - (totalPagar * 0.10f)
            println("Sacaste la pelota roja, 10% de descuento")
            println("Tu total a pagar con el descuento es de ${descuento}$")

        }else if (pelota == 2){
            var descuento:Float = totalPagar - (totalPagar * 0.30f)
            println("Sacaste la pelota azul, 30% de descuento")
            println("Tu total a pagar con el descuento es de ${descuento}$")

        }else if (pelota == 3){
            var descuento:Float = totalPagar - (totalPagar * 0.50f)
            println("Sacaste la pelota amarillo, 50% de descuento")
            println("Tu total a pagar con el descuento es de ${descuento}$")

        }else if (pelota == 4){
            var descuento:Int = totalPagar - totalPagar
            println("te llevas tu compra completamente gratis")
            println("Tu total a pagar con el descuento es de ${descuento}$")
        }
    }else{
        print("Tu total a pagar es de ${totalPagar}$")
    }

}