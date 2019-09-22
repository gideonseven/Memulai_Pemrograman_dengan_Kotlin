fun main() {
    val valueA = 65
    val valueB = 52
    val valueC = 78

    val resultA = calculate(valueA, valueB, valueC)
    val resultB = calculate(valueA, valueB, null)

    println("resultA is $resultA\nresultB is $resultB".trimIndent())
}

fun calculate(valueA: Int, valueB: Int, valueC: Int?): String {
    // TODO 1
    val c = valueC ?: 100
    val result = valueA + (valueB - c)
    return generateResult(result)
}

// TODO 2
fun generateResult(result: Int) = result.toString()