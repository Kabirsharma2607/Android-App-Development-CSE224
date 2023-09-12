import java.util.*

fun main(args:Array<String>){
    var scn = Scanner(System.`in`)
    var n = scn.nextInt()
    var arr = IntArray(n)
    for(i in 0 until n) arr[i] = scn.nextInt()
    var max = Integer.MIN_VALUE
    var min = Integer.MAX_VALUE
    var maxInd = -1
    var minInd = -1

    for((index,i) in arr.withIndex()){
        if(max < i){
            max = i
            maxInd = index
        }
        if(min > i){
            min = i
            minInd = index
        }
    }
    arr[maxInd] = min

    for(i in arr) {
        print("${i}  ")
    }

}