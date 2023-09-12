fun main(args : Array<String>){
    label1@ for (i in 1 .. 3){
        label2@ for(j in 1 .. 3){
            label3@ for(k in 1 .. 3){
                if(i == 2) break@label2
                println("$i $j $k")
            }
        }
    }
}