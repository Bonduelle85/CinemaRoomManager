package cinema

const val BORDER_NUMBER = 60
const val FIRST_PRICE = 10
const val SECOND_PRICE = 8

fun main() {
    println("Enter the number of rows:")
    print("> ")
        val x = readln().toInt()
    println("Enter the number of seats in each row:")
    print("> ")
        val y = readln().toInt()
    println("Total income:")
    print("$")
        if (x * y > BORDER_NUMBER) {
               if (x % 2 == 0) {
                     print(FIRST_PRICE * x * y / 2 + SECOND_PRICE * x * y / 2)
               } else print(FIRST_PRICE * (x - 1) * y / 2 + SECOND_PRICE * (x - 1) * y / 2 + SECOND_PRICE * y)
        } else print(x * y * FIRST_PRICE)
}

