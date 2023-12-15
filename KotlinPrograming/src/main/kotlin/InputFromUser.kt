fun main() {
    print("Enter Integer Number : ")
   val number = readln()?.toIntOrNull()
    if (number!=null) {
        println("Your Entered Number is : $number")
    }
    else
    {
        println("Please Enter Integer Number...")
    }
}