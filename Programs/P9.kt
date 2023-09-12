fun main(args: Array<String>){
//    var a = 10
//    while(a > 0){
//        println(a + 1)
//        a--;
//    }
//    println()
//
//    println("inside do while")
//    var x = 0
//    do{
//        println(x)
//        x++
//    }while (x < 10)
//    println()
//    for(i in 65.toChar() .. 'z'){
//        println(i)
//    }
//    for( i in 1 .. 10 step 2) println(i)
//    for(i in 10 downTo 0 step 2) println(i)
//    println()
//    var arr= arrayOf("A","B","C","D","E")
//    arr.set(4,"hE")
//    for(A in arr)  //or for(A:String in arr)  mentioning the data type specifically
//    {
//        println("in the array fetch the value directly  $A")
//    }
//    println()
//    println("inside for loop over array to access on the basis of index-value pair using withIndex()")
//    var planets = arrayOf("Earth", "Mars", "Venus", "Jupiter", "Saturn")
//    for ((index,value) in planets.withIndex()) {
//        println("Element at $index th index is $value")
//    }
//    println()
//    var n: String  = "Hello Kabir!"
//    for((i,ch) in n.withIndex()) println("$i $ch")
    var array : Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    for(n in array) if(n % 2 != 0) println(n)
    var a = if(5 < 0){
        "5 is greater than 0"
    }else{
        789221

    }
    println(a)
}