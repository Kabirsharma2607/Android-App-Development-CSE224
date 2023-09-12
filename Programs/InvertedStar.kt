import java.util.Scanner

fun main(args:Array<String>){
    var scn = Scanner(System.`in`)
    var n = scn.nextInt()
    for(i in 1 .. n){
        for(j in 1 .. i) print(" ")
        for(k in i .. n) print("* ")
        println()
    }
}