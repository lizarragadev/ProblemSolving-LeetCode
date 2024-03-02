import java.io.PrintWriter

/*
* URL: https://leetcode.com/problems/two-sum/
* @autor: lizarragadev
* */

class Solution{
    fun twoSum(nums: IntArray, target: Int): IntArray? {
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement)) {
                return map[complement]?.let { intArrayOf(it, i) }
            }
            map[nums[i]] = i
        }
        return TODO("Provide the return value")
    }
}

fun main() {
    _writer.p0001_TwoSum()
    _writer.flush()
}

fun PrintWriter.p0001_TwoSum() {
    val n = readInt()
    val nums = readIntArray(n)
    val target = readInt()
    println(Solution().twoSum(nums, target).contentToString())
}
