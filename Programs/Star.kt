//import java.util.Arrays
//import java.util.Scanner
//
//fun main(args: Array<String>){
//    var scn = Scanner(System.`in`)
////    println("Enter number of rows")
////    var n: Int = scn.nextInt()
////    for(i in 1 .. n){
////        for(j in 1 .. n - i) print(" ")
////        for(k in 1 .. i*2 - 1) print("*")
////        println()
////    }
//    println("Enter size of array")
//    var n: Int = scn.nextInt()
////    var arr = IntArray(n)
////    for(i in 0 until n){
////        arr[i] = scn.nextInt()
////    }
////    for(i in 0 until n - 1){
////        for(j in 0 until n-i-1){
////            if(arr[j] > arr[j + 1]){
////                swap(arr,j,j+1)
////            }
////        }
////    }
//
//    var arr = CharArray(n)
//    for(i in 0 until n) arr[i] = scn.next()[0]
//
//    for(i in 0 until n-1){
//        for(j in 0 until n - i -1){
//            if(arr[j] > arr[j + 1]) swap(arr,j.toInt(),(j+1).toInt())
//        }
//    }
//
//
//    println(Arrays.toString(arr))
//}
//
//fun swap(arr: CharArray, i:Int, j:Int) {
//    var temp = arr[i]
//    arr[i] = arr[j]
//    arr[j] = temp
//}

fun main() {
    val strArray = arrayOf("apple", "zac", "cherry", "date", "fig")

    bubbleSort(strArray)

    println("Sorted Array (Bubble Sort): ${strArray.joinToString(", ")}")
}

fun bubbleSort(arr: Array<String>) {
    val n = arr.size
    var swapped: Boolean

    do {
        swapped = false
        for (i in 0 until n - 1) {
            if (arr[i] > arr[i + 1]) {
                val temp = arr[i]
                arr[i] = arr[i + 1]
                arr[i + 1] = temp
                swapped = true
            }
        }
    } while (swapped)
}






