object EliudsEggs {

    fun eggCount(number: Int): Int{
        var contador = 0
        var n = number
        while (n > 0) {
            if ((n and 1) == 1) {
                contador++
            }
            n = (n shr 1)
        }
        return contador
    }
}
