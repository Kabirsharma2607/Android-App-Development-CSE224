fun main(args:Array<String>){
    println("High order function")
    highOrderWithoutReturn("Return Nothing", ::Function1)
    println()
    println("High Order without return")
    highOrderWithReturn(::Function2)
}

fun highOrderWithoutReturn(str:String,myFunc:(String) -> Unit){
    myFunc("Without return as argument")
}
fun Function1(str:String){
    println(str)
}

fun highOrderWithReturn(myFunc2:(Int,Int) -> Int){
    var res = myFunc2(5,6)
    println("$res")
}

fun Function2(a:Int,b:Int):Int{
    return a + b
}
