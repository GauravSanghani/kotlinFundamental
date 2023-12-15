fun main() {
    print("Enter dividend: ")
    val dividend = readlnOrNull()?.toIntOrNull()

    print("Enter divisor: ")
    val divisor = readlnOrNull()?.toIntOrNull()

    if (dividend != null && divisor != null && divisor != 0) {
        val quotient = dividend / divisor
        val remainder = dividend % divisor

        println("Quotient: $quotient")
        println("Remainder: $remainder")
    } else {
        println("Error: Please enter valid non-null integer values for dividend and divisor. Divisor should not be zero.")
    }
}
