class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
   val frequencyMap = mutableMapOf<Int, Int>()
        for (num in nums) {
            frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
        }
        // Sort the entries by frequency and take the top k
        return frequencyMap.toList().sortedByDescending { it.second }.take(k).map { it.first }.toIntArray()
    }
}
