fun main() {
    print("Enter 1st number : ")
    val num1 = readln().toIntOrNull()
    print("Enter 2nd number : ")
    val num2 = readln().toIntOrNull()
    print("Enter 3rd number : ")
    val num3 = readln().toIntOrNull()

    if (num1 != null && num2 != null && num3 != null)
    {
        val maxValue = { a: Int, b: Int, c: Int -> maxOf(a, b, c) }

        println("Maximum value: ${maxValue(num1, num2, num3)}")
    } else {
        println("Error: Please enter three not empty numbers .")
    }
}
