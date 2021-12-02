fun main() {
    val number1 = 1705
    val century:Double = number1.toDouble() / 100
    val op = century % 1

    println(op)
    //println(century.toInt())

    if (op != 0.0){
        println(century.plus(1).toInt())

    }


}