fun main() {
    // Creating a HashMap to store Indian City-State pairs
    val indiaCityStateMap = hashMapOf(
        "Mumbai" to "Maharashtra",
        "Delhi" to "Delhi",
        "Bangalore" to "Karnataka",
        "Chennai" to "Tamil Nadu",
        "Kolkata" to "West Bengal"
    )

    // Printing all values using a loop
    println("Indian City-State Pairs:")
    for ((city, state) in indiaCityStateMap) {
        println("$city, $state")
    }
}
