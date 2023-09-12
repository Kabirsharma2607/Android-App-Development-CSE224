fun main(args: Array<String>){
    println("inside if expression ")
    var result=if(5>7)
    {
        //direct value to return.it could be int,float string,char etc
        "hello inside if part of if as an expression"
    }
    else
    {
        //direct value to return.it could be int,float string,char etc
        678
    }
    print(result)
    fxnAsExpression()
}
fun fxnAsExpression()
{
    println("inside expression function")
    val a = 10
    val b = 5
    println(a+b)
}