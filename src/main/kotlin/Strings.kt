fun main () {
    val myMessage = "Happy Birthday! Justin!"

    val myText = "Happy Birthday! Justin!";

    //compare 2 string
    println(myText.compareTo(myMessage))


    //length of the string
    println(myMessage.length)

    // get certain character thru start and end index
    println(myMessage.subSequence(start = 16, end = 22))
    println(myMessage.substring(startIndex = 16, endIndex = 22))

    //concat
    val firstName = "Jeff"
    val middleInitial = "E"
    val lastName = "Bulatao"

    println(firstName + middleInitial + lastName)


    //random char on a string
    println(firstName.random())





}