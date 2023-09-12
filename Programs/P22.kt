import java.util.Scanner

class P27ClassesAndObjects{
    var name: String = "abc"
    var rollNo: Int = 12

    fun assignAndDisplay(name: String, rollNo: Int){
        this.name = name
        this.rollNo =rollNo
        println("The name you entered is $name and roll No is $rollNo")
    }
}

fun main(args:Array<String>){
    var obj = P27ClassesAndObjects()
    println("Default Values")
    println("Default obj name is ${obj.name}")
    println("Default obj rollNo is ${obj.rollNo}")
    println()

    var scn = Scanner(System.`in`)
    println("Enter name")

    var name = scn.next()
    println("Enter rollNo")
    var rollNo = scn.nextInt()
    obj.assignAndDisplay(name,rollNo)


}