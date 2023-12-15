fun main() {
    print("Enter a string: ")
    val inputString = readlnOrNull()

    if (!inputString.isNullOrEmpty()) {
        val charFrequencyMap = mutableMapOf<Char, Int>()

        // Count the frequency of each character
        for (char in inputString) {
            charFrequencyMap[char] = charFrequencyMap.getOrDefault(char, 0) + 1
        }

        // Print the frequency of each character
        println("Character frequencies:")
        for ((char, frequency) in charFrequencyMap) {
            println("$char: $frequency")
        }
    } else {
        println("Error: Please enter a non-empty string.")
    }
}
