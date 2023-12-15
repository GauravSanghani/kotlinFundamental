fun main() {
    print("Enter Number : ")
    val num = readln().toIntOrNull()
    if (num != null) {
        if (num.rem(2)==0){
            print("Enter Number Is Even Number")}
        else{
            print("Enter Number Is Odd Number")
        }
    }
    else{
        print("Please Enter Any Number...")
    }

}