fun main() {
    print("Enter Character TO Want ASCII Value : ")
    val char = readln()
    if (char!=null && char.length==1){
    println("Enter Character ASCII value is : ${char[0].toInt()}")}
    else
    {
        println("Please Enter Single Character" )}
}