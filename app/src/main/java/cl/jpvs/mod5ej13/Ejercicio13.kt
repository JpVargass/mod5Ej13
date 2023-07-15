package cl.jpvs.mod5ej13


import java.text.NumberFormat
import java.util.Currency
import kotlin.math.ceil

fun main(){
    var resultado = suma(5.5, 6.4F)
    println("resultado $resultado")

    var resultado2 = redondeo(7.9)
    println("redondeo de 7.9 $resultado2")

    var muestraResultado = muestraResultado(8.7)
    println(muestraResultado)

}
fun suma (param1 : Double, param2 : Float) : Double = param1 + param2

fun redondeo (param1 : Double)= ceil(param1)

fun muestraResultado(numero: Double) : String {

    val format: NumberFormat = NumberFormat.getCurrencyInstance()
    format.setMaximumFractionDigits(2)
    format.setCurrency(Currency.getInstance("CLP"))
    println(format.format(numero))
    return format.format(numero)


}