package classes

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

fun sum1(list: List<Int>, k:Int):Boolean{
    for (i in list){
        for (j in list){
            if (i!= j && i + j == k){
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





fun main() {
    val nums = intArrayOf(10, 15, 7,4,52,13,1,3)
    val lst = listOf(10, 15, 7,4,52,13,1,3)
    val target = 53
    twoSum(nums, target)
    println()
    println(sum1(lst, target))
    println(sumOptimized(lst, target))

}

