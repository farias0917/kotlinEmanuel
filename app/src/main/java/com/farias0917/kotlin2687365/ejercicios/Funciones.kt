package com.farias0917.kotlin2687365.ejercicios

class Funciones {
}

fun main(){

    /*println("digite su edad pa poder entrar en el sistema")
    val edad:Int = readLine()!!.toInt()
    if (edad>=18){
        println("Bienvenido mi amol piupiu 🔫")
    }else{
        println("Pala casa mi rey 🤩")
    }*/
    /*fun edadEntrar(edad:Int){
        if (edad>=18){
            println("Bienvenido mi amol piupiu 🔫")
        }else{
            println("Pala casa mi rey 🤩")
        }
    }

    println("digite su edad pa poder entrar en el sistema")
    val edad:Int = readLine()!!.toInt()
    edadEntrar(edad)*/
    /*

    fun areaCirculo(){

        println("bienvenide")
        println("digita el radio del circulo")
        var radio= readLine()!!.toFloat()
        var pi:Float=3.1416F
        var total:Float= pi * (radio*radio)
        println("el area del circulo es: $total")

    }
    fun perimetroCirculo(){

        println("bienvenide")

        println("digita el perimetro del circulo")
        var radio= readLine()!!.toFloat()
        var pi:Float=3.1416F
        var total:Float= (pi*pi) * radio
        println("el perimetro del circulo es: $total")
    }

    println("que quieres calcular")
    println("digite area o perimetro segun lo que quieras calcular")
    var  opcion= readLine()!!.toString()

    if (opcion=="area"){
        areaCirculo()


    }else if (opcion=="perimetro"){
        perimetroCirculo()
    }
*/
    /*   fun areaCirculo(radio:Float){
           var pi:Float=3.1416F
           var total:Float= pi * (radio*radio)
           println("el area del circulo es: $total")
       }
       fun perimetroCirculo(radio: Float){
           var pi:Float=3.1416F
           var total:Float= (pi*pi) * radio
           println("el perimetro del circulo es: $total")
       }
       fun areaTriangulo(base:Float, altura:Float){
           var total:Float=(base*altura)/2
           println("el area del triangulo es: $total")

       }
       fun perimetroTriangulo(lado1:Float, lado2:Float,lado3:Float){
           var total:Float=lado1+lado2+lado3
           println("el perimetro del triangulo es: $total")
       }

       var opcion:String="si"
       while (opcion=="si") {
           println("que quieres calcular")
           print("circulo o triangulo")
           var figura = readLine()!!.toString()

           if (figura == "circulo") {
               println("digite area o perimetro segun lo que quieras calcular o triangulo")
               var opcion = readLine()!!.toString()

               if (opcion == "area") {
                   println("bienvenide")
                   println("digita el radio del circulo")
                   var radio = readLine()!!.toFloat()
                   areaCirculo(radio)

               } else if (opcion == "perimetro") {
                   println("bienvenide")

                   println("digita el perimetro del circulo")
                   var radio = readLine()!!.toFloat()
                   perimetroCirculo(radio)
               }
           } else if (figura == "triangulo") {
               println("digite area o perimetro segun lo que quieras calcular")
               var opcion = readLine()!!.toString()

               if (opcion == "area") {
                   println("bienvenide")
                   println("digita la base del triangulo")
                   var base = readLine()!!.toFloat()

                   println("digita la altura del triangulo")
                   var altura = readLine()!!.toFloat()
                   areaTriangulo(base, altura)

               } else if (opcion == "perimetro") {
                   println("bienvenide")

                   println("digita el primer lado del triangulo")
                   var lado1 = readLine()!!.toFloat()
                   println("digita el segundo lado del triangulo")
                   var lado2 = readLine()!!.toFloat()
                   println("digita el tercer lado del triangulo")
                   var lado3 = readLine()!!.toFloat()

                   perimetroTriangulo(lado1, lado2, lado3)
               }
           }
           println("quiere volver a calcular algo?")
           println("si es asi digite si, si no quiere digite no")
           opcion= readLine()!!.toString()
       }
   */

    fun rectanguloArea (base:Int,altura:Int): Int {
        return base*altura
    }
    fun rectanguloPerimetro(base:Int, altura:Int):Int{
        return (base+altura)*2

    }

    println("que quiere hacer area o perimetro?")
    var opcion:String= readLine()!!.toString().lowercase()
    if (opcion=="area"){
        println("digite la base del retangulo")
        var base= readLine()!!.toInt()
        println("digite la altura del rectangulo")
        var altura= readLine()!!.toInt()
        print(rectanguloArea(base, altura))
    }else if (opcion=="perimetro"){
        println("digite la base del retangulo")
        var base= readLine()!!.toInt()
        println("digite la altura del rectangulo")
        var altura= readLine()!!.toInt()
        print(rectanguloPerimetro(base, altura))
    }
}