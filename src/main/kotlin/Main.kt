package org.example

fun main() {
    //println(1 < 1)
    println("*******")
    println(nue())

    println("----------")
    println("----------")
    println(nuev())

    println("----------")
    println("Agrega una rama else con un cuerpo println(\"x is not prime number between 1 and 10.\"):")
    println(nuevo())

    println("----------")
    println("Quita las ramas individuales de las condiciones 3, 5 y 7:")
    println(nuevo1())

    println("* --------- *")
    println("Cómo usar la palabra clave in para un rango de condiciones")
    println(nuevo2())

    println("* -------- *")
    println("* Cómo usar la palabra clave is para verificar el tipo de datos *")
    println(nuevo3())

    println("* -------- *")
    println("* Cómo agregar una condición adicional con el mismo cuerpo *")
    println(nuevo4())

    println("* -------- *")








}
fun nue(){
    val trafficLightColor = "Green"

    if (trafficLightColor == "Red") {
        println("Stop")
    } else if (trafficLightColor == "Yellow") {
        println("Slow")
    } else if (trafficLightColor == "Green") {
        println("Go")
    } else {
        println("Invalid traffic-light color")
    }
}
fun nuev(){
    val trafficLightColor = "Yellow"

    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }

}
fun nuevo(){
    val x = 3

    when (x) {
        2 -> println("x is a prime number between 1 and 10.")
        3 -> println("x is a prime number between 1 and 10.")
        5 -> println("x is a prime number between 1 and 10.")
        7 -> println("x is a prime number between 1 and 10.")
        else -> println("x isn't a prime number between 1 and 10.")
    }


}
fun nuevo1() {
    val x = 3

    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        else -> println("x isn't a prime number between 1 and 10.")
    }
}
fun nuevo2(){
    val x = 4

    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        else -> println("x isn't a prime number between 1 and 10.")
    }
}
fun nuevo3(){
    val x: Any = 20

    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        is Int -> println("x is an integer number, but not between 1 and 10.")
        else -> println("x isn't an integer number.")
    }
}
fun nuevo4(){
    val trafficLightColor = "Amber"

    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow", "Amber" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }

}



