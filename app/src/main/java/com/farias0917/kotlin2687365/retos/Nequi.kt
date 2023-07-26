package com.farias0917.kotlin2687365

class Nequi {
}
var user:Long=3133442656
var sendUser1:Long=3142656767
var sendUser2:Long=3213145676
var sendUser3:Long=3015265276
var pass:Int=3254
var loginAttemps:Int=3
var op = "si"
var accountBalance:Int = 4500
var amountMoney:Int = 0

fun sacarDinero(d1:Int) {
    if (accountBalance < 2000){
        println("--No puedes hacer el retiro, tu saldo debe ser superior a $2000--")
    }else if(d1 > accountBalance){
        println("No tienes suficiente dinero para retirar")
    }else{
        println("confirmar el retiro")
        var confirm = readLine()!!.toInt()
        if (confirm == amountMoney ){
            var randomCode:Int = (100000..900000).random()
            println("Escribe el codigo de 6 digitos para realizar el retiro")
            println("el codigo es $randomCode")
            var code = readLine()!!.toInt()
            if (code == randomCode){
                println("\n--El retiro se ha realizado con exito--\n")
                accountBalance = accountBalance - amountMoney
            }else{
                println("--No se puede realizar el retiro, el código no coincide\n--")
            }


        }else{
            println("--La confirmación debe coincidir con la cantidad de dinero a retirar--")
        }
    }
}

fun enviarDinero(d1:Long,d2:Int){
    if (d1 == sendUser1 || d1 == sendUser2 || d1 == sendUser3){
        if (d2 > accountBalance){
            println("--No es posible  enviar el dinero, saldo insuficiente--")
        }else{
            println("\n--Se envió el dinero al número $sendUser1 con un valor de $$d2--\n")
            accountBalance = accountBalance - amountMoney
        }
    }else{
        println("--El número ingresado es desnonocido--")
    }
}
fun recargarDinero(d1:Int){
    println("¿Desea confirmar la recarga?")
    var confirmRch = readLine()!!.toString()
    if (confirmRch.lowercase() == "si"){
        println("--La recarga se ha realizado con exito--")
        accountBalance = accountBalance + amountMoney
    }else{
        println("--La recarga se ha cancelado--")
    }
}

fun salir(){
    println("--Has salido de la aplicación--.\n")
    loginAttemps = -1
}

fun main() {
    while (loginAttemps >= 0){
        println("Digite su número de telefóno")
        var logUser:Long = readLine()!!.toLong()

        println("Digite su contraseña")
        var logPass:Int= readLine()!!.toInt()

        if (logUser == user && logPass == pass){

            while (op.lowercase() == "si") {
                println("Hola!, te damos la bienvenida a nequi")
                println(
                    "Saldo disponible $$accountBalance\n")

                println("Que función deseas realizar:")
                println("1.Retirar dinero\n" +
                        "2.Enviar dinero\n" +
                        "3.Recargar dinero\n" +
                        "4.Salir")
                var menuOp = readLine()!!.toInt()

                if (menuOp == 1){
                    println(
                        "vas a retirar desde:\n" +
                                "1.cajero \n" +
                                "2.punto fisico"
                    )
                    var withdrawMoney = readLine()!!.toInt()

                    if (withdrawMoney == 1) {
                        println("Tu retiro será desde el cajero")
                        println("¿Cuanto deseas retirar?")
                        amountMoney= readLine()!!.toInt()
                        sacarDinero(amountMoney)

                    } else if (withdrawMoney == 2) {
                        println("Tu retiro será desde el punto fisico")
                        println("¿Cuanto deseas retirar?")
                        amountMoney= readLine()!!.toInt()
                        sacarDinero(amountMoney)
                    }else{
                        println("--Selecciona un lugar de retiro válido--")
                    }
                }else if (menuOp == 2){
                    println("Ingresa el número de teléfono del destinatario")
                    var userPhone = readLine()!!.toLong()

                    println("Ingresa el el valor a enviar")
                    amountMoney  = readLine()!!.toInt()

                    enviarDinero(userPhone, amountMoney)
                }else if (menuOp == 3){
                    println("Ingresa el valor que vas a recargar")
                    amountMoney = readLine()!!.toInt()
                    recargarDinero(amountMoney)
                }else if(menuOp == 4){
                    salir()
                    break
                }
            }
        }else if(loginAttemps == 0){
            println("Tu cuenta ha sido bloqueada, debes contactarte con el banco :(")
            break

        }else{
            println("¡Upps! Parece que tus datos de acceso " +
                    "no son correctos, Tienes $loginAttemps intentos más")
            loginAttemps --
        }
    }



}

