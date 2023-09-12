import java.util.Scanner

fun main(args:Array<String>){
    var scn = Scanner(System.`in`)
    var n = scn.nextInt()
    var arr = IntArray(n)
    for(i in 0 until n) arr[i] =scn.nextInt()
    for(i in 0 until n){
        if(arr[i] > 100){
            arr[i] = (arr[i] - 0.2*arr[i]).toInt()
        }
    }
    var sum = 0
    for(i in 0 until n) sum+= arr[i]
    println(sum)
}