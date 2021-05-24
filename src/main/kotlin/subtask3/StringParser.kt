package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val parsedElementArray = mutableListOf<String>()
        val excludedIndices = mutableListOf<Int>()
        for (i in inputString.length - 1 downTo 0) {
            var elementArray = ""
            if (inputString[i] == '(') {
                for (j in i + 1 until inputString.length) {
                    if (inputString[j] == ')' && j !in excludedIndices) {
                        excludedIndices.add(j)
                        elementArray = inputString.substring(i+1,j)
                        break
                    }
                }
            }
            if (inputString[i] == '<') {
                for (j in i + 1 until inputString.length) {
                    if (inputString[j] == '>' && j !in excludedIndices) {
                        excludedIndices.add(j)
                        elementArray = inputString.substring(i + 1, j)
                        break
                    }
                }
            }
            if (inputString[i] == '[') {
                for (j in i + 1 until inputString.length) {
                    if (inputString[j] == ']' && j !in excludedIndices) {
                        excludedIndices.add(j)
                        elementArray = inputString.substring(i+1,j)
                        break
                    }
                }
            }
            if (elementArray.isNotEmpty()) parsedElementArray.add(elementArray)
        }
        return parsedElementArray.toTypedArray().reversedArray()
    }
}


