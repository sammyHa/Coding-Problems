
/**
@author Samim Hakimi
5/24/2019 4:36 AM
 */

/**
 *
This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

 */

class TwoSum {
    fun sum(list: List<Int>, k:Int):Boolean{
        for (i in list){
            for (j in list){
                if (i != j && i + j == k){
                    return true
                }
            }
        }
        return false
    }

    fun sumOptimized(list:List<Int>, k:Int):Boolean{
        val seen = mutableListOf<Int>()
        for (i in list){
            if (k - i in seen){
                return true
            }
            seen.add(i)
        }
        return false
    }
}

fun main(args:Array<String>){
    val lst = listOf(10,15,3,7)
    val k = 17
    val twoSum = TwoSum()
    twoSum.sum(lst, k)
    twoSum.sumOptimized(lst, k)
}