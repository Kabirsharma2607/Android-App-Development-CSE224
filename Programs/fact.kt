import kotlin.system.measureTimeMillis

fun main(args:Array<String>) {
    val executionTime = measureTimeMillis {
    println("Enter number")
    var n = readLine()!!
    var dp = Array<Long>(n.toInt() + 1) { -1 }
    println(fact(n.toInt(), dp))
}
    println("Program executed in $executionTime milliseconds")

}
fun fact(a:Int, dp: Array<Long>):Long{
    if(a < 1) return 1
    if(dp[a].toInt() != -1) return dp[a]

    dp[a] = a * fact(a-1,dp)
    return dp[a]
}