import java.util.*
import javax.print.attribute.SetOfIntegerSyntax

fun main(args: Array<String>){
    val lst = listOf<Int>(11, 15, 3, 8)

    val k = 18
    two_sum(lst, k)
}

fun two_sum(lst: List<Int>, k: Int):Boolean{

    for(i: Int in lst){
        if (k - i != lst.indexOf(i+1)){
            print(" k value can't be found")
            break
        }else{
            print(" k value is $k")
            break
        }
    }
    return false
}

