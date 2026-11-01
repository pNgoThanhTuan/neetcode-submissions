class Solution {
    fun isAnagram(s: String, t: String): Boolean {
         if (s.length != t.length) {
            return false
        }
        val countMaps = mutableMapOf<Char, Int>()
        val countMapt = mutableMapOf<Char, Int>()
        for (i in 0 until s.length) { 
            
            countMaps[s[i]] = countMaps.getOrDefault(s[i], 0) + 1
            countMapt[t[i]] = countMapt.getOrDefault(t[i], 0) + 1
        }
        return countMaps == countMapt
    }
}
