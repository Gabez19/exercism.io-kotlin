import kotlin.math.sqrt

object Darts {

    fun score(x: Number, y: Number): Int {

        val xDouble = x.toDouble()
        val yDouble = y.toDouble()

        val distancia = sqrt(xDouble * xDouble + yDouble * yDouble)

        return when {
            distancia <= 1 -> 10
            distancia <= 5 -> 5
            distancia <= 10 -> 1
            else -> 0
        }
    }
}