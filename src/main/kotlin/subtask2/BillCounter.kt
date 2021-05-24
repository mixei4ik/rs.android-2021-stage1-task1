package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var summForAnn = 0
        for (i in 0..bill.size - 1) {
            if (i != k) summForAnn += bill[i]
        }
        if (summForAnn / 2 == b) {
            return "Bon Appetit"
        } else {
            return (b - summForAnn / 2).toString()
        }
    }
}
