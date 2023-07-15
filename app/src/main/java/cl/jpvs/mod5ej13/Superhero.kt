package cl.jpvs.mod5ej13

data class Heroe(
    val superHero :String,
    val publisher: String,
    val realName : String,
    var photo :String
)

fun main(){

    var seguir = "S"

    var heroes = mutableListOf<Heroe>()

    while (seguir.equals("S") || seguir.equals("s") ) {

     print("nombre :")
    var nombre = readln()

    print("Publisher :")
    var publisher = readln()

    print("Nombre Real :")
    var realName = readln()

    print("Photo :")
    var photo = readln()

        heroes.add(Heroe(nombre, publisher, realName, photo))

    println("Desea ingresar otro Heroe (s = para seguir)")
    seguir=readln()
    }

    for (h in  heroes)
        println(h)

}
