class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
       
        val hashMap = mutableMapOf<Int, Int>()
        for (num in nums) {
            if (hashMap.containsKey(num)) {
                return true
            } else {
                hashMap[num] = 1
            }
        }
        return false;
    }
}
