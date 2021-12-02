import java.time.LocalDate
import java.time.LocalDateTime


fun main() {
//    println("what is your Name?")
//    val yourName = readLine()

//    println("Your Birth year?")
//    val bdayYear = Integer.valueOf(readLine())
//
//    // Curent date
//    val date = LocalDate.now()
//
//    val age = date.year.toInt() - bdayYear
//
//    println(age)


    println("Your Birthdate? must be YYYY-MM-DD")
    val bdayInput: String? = readLine()

    val date1 = LocalDate.parse(bdayInput)
    //val date2 = LocalDate.now()

    println("You are ${date1.until(LocalDate.now()).years} years old")


}







