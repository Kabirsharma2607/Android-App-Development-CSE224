////fun main(args : Array<String>){
//    println("array creation using Array class")
//    var arr3=Array(3,{i->i+2})
//    for(i in 0..arr3.size-1)  //OR for(i in 10..20) it will represent elements value as 10 to 20
//        println("array created using Array class have elements $i")
//
//
//}

import java.util.Arrays
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Ask the user for the size of the array
    println("Enter the size of the array:")
    val size = scanner.nextInt()

    // Declare an array of the given size
    val array = IntArray(size)

    // Populate the array with user input
    for (i in 0 until size) {
        println("Enter element at index ${i + 1}:")
        val element = scanner.nextInt()
        array[i] = element
    }

    // Close the scanner
    scanner.close()
    Arrays.sort(array)
    // Print the array
    println("Array elements:")
    for (element in array) {
        println(element)
    }
}
