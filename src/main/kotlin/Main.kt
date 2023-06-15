val sum1 = { a: Int, b: Int -> a + b }

// without type annotation in lambda expression
val sum2:(Int,Int)-> Int  = { a , b -> a + b}


// anonymous function with body as an expression
val anonymous1 = fun(x: Int, y: Int): Int = x + y

// anonymous function with body as a block
val anonymous2 = fun(a: Int, b: Int): Int {
    val mul = a * b
    return mul
}

val numbers = arrayOf(1,-2,3,-4,5)

fun main(args: Array<String>) {
    val result1 = sum1(2,3)
    val result2 = sum2(3,4)
    println("The sum of two numbers is: $result1")
    println("The sum of two numbers is: $result2")
    val sum = anonymous1(3,5)
    val mul = anonymous2(3,5)
    println("The sum of two numbers is: $sum")
    println("The multiply of two numbers is: $mul")

    println(numbers.filter {item -> item > 0 })
}