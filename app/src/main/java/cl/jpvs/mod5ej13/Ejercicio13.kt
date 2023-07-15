package cl.jpvs.mod5ej13

import kotlin.math.ceil

fun main(){
    var resultado = suma(5.5, 6.4F)
    println("resultado $resultado")

    var resultado2 = redondeo(7.9)
    println("redondeo de 7.9 $resultado2")

}
fun suma (param1 : Double, param2 : Float) : Double = param1 + param2

fun redondeo (param1 : Double)= ceil(param1)

