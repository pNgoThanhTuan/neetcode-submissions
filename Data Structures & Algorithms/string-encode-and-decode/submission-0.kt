class Solution {

     fun encode(strs: List<String>): String {
        var encodedString = ""
        for (str in strs) {
            encodedString += "${str.length}#${str}"
        }
        return encodedString
    }

    fun decode(str: String): List<String> {
        val decodedStrings = mutableListOf<String>()
        var i = 0
        while (i < str.length) {
            // Find the position of '#'
            val delimiterPos = str.indexOf('#', i)
            // Extract the length of the next string
            val length = str.substring(i, delimiterPos).toInt()
            // Extract the string itself
            val s = str.substring(delimiterPos + 1, delimiterPos + 1 + length)
            decodedStrings.add(s)
            // Move to the next string
            i = delimiterPos + 1 + length
        }
        return decodedStrings
    }
}
