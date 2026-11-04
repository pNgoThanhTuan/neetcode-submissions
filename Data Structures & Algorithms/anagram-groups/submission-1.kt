class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        var hashMap = mutableMapOf<String, MutableList<String>>()
        for (str in strs) { 
            //this take alot of time to sort the string.
            //please help to think another way to group the anagrams without sorting the string. we can use the count of each character in the string to group the anagrams. we can use a array of size 26 to count the number of each character in the string. then we can use the array as the key in the hash map. this way we can group the anagrams without sorting the string.
            val count = IntArray(26)
            for (c in str) {
                count[c - 'a']++//what does this line mean? this line means that we are counting the number of each character in the string. we are using the character as the index in the array. for example, if the character is 'a', then we are incrementing the value at index 0 in the array. if the character is 'b', then we are incrementing the value at index 1 in the array. and so on.
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
