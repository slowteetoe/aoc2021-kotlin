fun main() {

    fun part1(input: List<String>): Int {
        var hpos = 0
        var depth = 0
        input.forEach {
            val cmdAndAmount = it.trim().split(" ")
            val cmd = cmdAndAmount[0]
            val amt = cmdAndAmount[1].toInt()
            when (cmd) {
                "forward" -> {
                    hpos += amt
                }
                "down" -> {
                    depth += amt
                }
                else -> {
                    depth -= amt
                }
            }
        }
        return hpos * depth
    }

    fun part2(input: List<String>): Int {
        var hpos = 0
        var depth = 0
        var aim = 0
        input.forEach {
            val cmdAndAmount = it.trim().split(" ")
            val cmd = cmdAndAmount[0]
            val amt = cmdAndAmount[1].toInt()
            when (cmd) {
                "forward" -> {
                    hpos += amt
                    depth += aim * amt
                }
                "down" -> {
                    aim += amt
                }
                else -> {
                    aim -= amt
                }
            }
        }
        return hpos * depth
    }

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
