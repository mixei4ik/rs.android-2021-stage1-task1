package subtask1

class HappyArray {
    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.size <= 2) return sadArray
        val happyArray = sadArray.toMutableList()
        var checkArray = sadArray
        while (arrayIsHappy(checkArray) == false) {
            for (i in (checkArray.size - 2) downTo 1)
                if (checkArray[i] > (checkArray[i - 1] + checkArray[i + 1])) {
                    happyArray.removeAt(i)
                }
            checkArray = happyArray.toIntArray()
        }
        return happyArray.toIntArray()
    }

    fun arrayIsHappy(checkArray: IntArray): Boolean {
        var result = true
        for (i in 1..checkArray.size - 2)
            if (checkArray[i] > (checkArray[i - 1] + checkArray[i + 1])) result = false
        return result
    }
}
