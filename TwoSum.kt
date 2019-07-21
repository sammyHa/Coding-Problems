/**
@author Samim Hakimi
5/24/2019 4:36 AM
 */

/**
 *
This problem was recently asked by Google.
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true or print the indices of the two values in the list since 10 + 7 is 17.
 */


fun twoSum(list: List<Int>, k:Int):Boolean{
    for (i in list){
        for (j in list){
            if (i != j && i + j == k){
                return true
            }
        }
    }
    return false
}


fun twoSum1(list:List<Int>, k:Int):Boolean{
    val seen = mutableListOf<Int>()
    for (i in list){
        if (k - i in seen){
            return true
        }
        seen.add(i)
    }
    return false
}


private fun twoSum(nums: IntArray, target:Int):IntArray {

    val hashMap = HashMap<Int, Int>()
    for (i in 0 until nums.size){
        if (hashMap.containsKey(target - nums[i])){
            val intArray = intArrayOf(hashMap.get(target- nums[i])!!, i)
                println(intArray.joinToString ())
            return intArray // return the indexes
        }
        hashMap.put(nums[i], i)
    }
    val intArray = intArrayOf(-1,-1)
    print(intArray.joinToString ())
    return intArray
}


fun main() {
    val nums = intArrayOf(10, 15, 7,4,52,13,1,3)
    val lst = listOf(10, 15, 7,4,52,13,1,3)

    val target = 53

    twoSum(nums, target)

    println()

    println(twoSum(lst, target))
    println(twoSum1(lst, target))

}

