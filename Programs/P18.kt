fun main(args:Array<String>){
    var a = {
        println("You can put one line expression")
        println(Math.pow(5.0,3.0))
    }
    a.invoke()

    var b = {x:Int, y:Int -> println("The sum is " + (x+y))}


    var d : (Int,Int) -> Int = {a,b -> a+b}
    println(d(20,10))

    val h:String.(Int)->String={this +" "+ it}
    var res = "hello".h(14)
    println(res)

    var j=arrayOf(1,2,3,-2,-4,5,6)
    println(j.filter {it > 0 })  //shorthand
    println(j.filter { j->j > 0 })  //longhand
    println()
}