class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        var hashMap = mutableMapOf<String, MutableList<String>>()
        for (str in strs) { 
            val sortedStr = str.toCharArray().sorted().joinToString("")
            if (!hashMap.containsKey(sortedStr)) {
                hashMap[sortedStr] = mutableListOf()
            }
            hashMap[sortedStr]?.add(str)
        }
        return hashMap.values.toList()
    }
}
