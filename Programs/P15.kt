fun main(args : Array<String>){
    var arr = Array(5,{i -> i * 4})
    for((i,value ) in arr.withIndex())
        println("$i $value")
    print(arr.sum())
    println(" ${add(5,9)} ${sub(7,9)}")
}
fun add(a:Int,b:Int):Int=a+b
fun sub(a:Int,b:Int):Int{
    return a - b;
}