fun main() {

    fun part1(input: List<String>): Int {
        var count = 0
        val ints = input.map { it.toInt() }
        for (n in ints.indices) {
            if (n > 0 && ints[n] > ints[n - 1]) {
                count++
            }
        }
        return count
    }

    fun part2(input: List<String>): Int {
        val ints = input.map { it.toInt() }
        var count = 0
        for (i in 3 until ints.size) {
            if (ints[i] + ints[i - 1] + ints[i - 2] > ints[i - 1] + ints[i - 2] + ints[i - 3]) {
                count++
            }
        }
        return count
    }

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
