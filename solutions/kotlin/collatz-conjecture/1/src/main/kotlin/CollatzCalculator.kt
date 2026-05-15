object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        var steps = 0
        var numUpdate = start

        if(numUpdate <= 0) {
            throw IllegalArgumentException("O número digitado: ${numUpdate} deveria ser positivo.")
        }
        
        while(numUpdate != 1) {
            if(numUpdate % 2 == 0) {
                numUpdate = numUpdate / 2
                steps++
            } else {
                numUpdate = 3 * numUpdate + 1
                steps ++
            }
        }
        return steps
    }
}