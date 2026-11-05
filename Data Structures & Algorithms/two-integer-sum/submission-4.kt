import kotlin.math.abs
class Solution {
      fun twoSum(nums: IntArray, target: Int): IntArray {
      var hashMap = mutableMapOf<Int, Int>()
        for (i in 0 until nums.size) {
            val complement = target - nums[i]
            if (hashMap.containsKey(complement)) {
                return intArrayOf(hashMap[complement]!!, i)
            }
            hashMap[nums[i]] = i
        }
        return intArrayOf()
    }
}
