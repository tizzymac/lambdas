fun main() {

    // Kotlin’s type inference allows the type of a lambda to be evaluated by the compiler
    val square = { x: Int -> x * x }
    val nine = square(3)
    println(nine)

    // to return the value as a String
    val squareString = { input : Int ->
        val magnitude = square(input)
        magnitude.toString()
    }
    println(squareString(8))

    // Use a lambda as a class extension
    fun extendString(arg: String, num: Int) : String {
        val another : String.(Int) -> String = { this + it }
        return arg.another(num)
    }
    print(extendString("Hello", 16))

    // The final expression is the value returned by the lambda
    val calculateGrade = { grade : Int ->
        when(grade) {
            in 0..40 -> "Fail"
            in 41..70 -> "Pass"
            in 71..100 -> "Distinction"
            else -> false
        }
    }
    println(calculateGrade(66))
    println(calculateGrade(666))

    // IT
    // the keyword 'it' is shorthand for a single argument lambda
    val fibonacci = arrayOf(1, 1, 2, 3, 5, 8)
    fibonacci.forEach { println(it * it) }
}