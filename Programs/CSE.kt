import java.util.Scanner

fun main(args:Array<String>){
    var scn = Scanner(System.`in`)
    var str = scn.next()
    for(i in str){
        if(i >= 'A' && i <='Z'){
            print("$i#")
        }
    }
}