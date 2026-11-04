class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        var hashMap = mutableMapOf<String, MutableList<String>>()
        for (str in strs) { 
            val count = IntArray(26)
            for (c in str) {
                count[c - 'a']++
            }
            val sortedStr = count.contentToString()
            if (!hashMap.containsKey(sortedStr)) {
                hashMap[sortedStr] = mutableListOf()
            }
            hashMap[sortedStr]?.add(str)
        }
        return hashMap.values.toList()
    }
}
