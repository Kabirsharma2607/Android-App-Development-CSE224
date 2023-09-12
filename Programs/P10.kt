import java.util.Scanner

fun main(args: Array<String>){
    var a = readln()!!
    var n = when(a){
        "1" -> 9
        "2" -> 8
        else -> 756
    }
    println(n)
    var scn = Scanner(System.`in`)
    var ip = scn.nextInt()
    when(ip){
        in 1 until 15 -> println("Number is less than 15")
        in 15 .. 30 -> println("Number is more than 15")
    }

}