fun main() {
//    println("Начинаем ритуал защиты!")
//    var index = 0
//    repeat(5) { index ->
//        if (index==2) {
//            println("Пропускаем шаг ${index+1} из-за машического вмешательства!")
//            return@repeat
//        }
//        println("Заклинание защиты активировано! (Шаг ${index+1})")
//    }
//    println("Замок защищен!")
//


//    val month = listOf("Python", "Kotlin", "C#", "C++", "Java")
//    println(month[0])
//    println(month.size)
//    println("Kotlin" in month)


//    val daysInMonth = listOf(31,28,31,30,31,30,31,31,30,31,30,31)
//    print("Введите номер месяца (1-12): ")
//    val input = readln().toInt()
//    if (input in 1..12) {
//        val days = daysInMonth[input-1]
//        println("В этом месяце $days дней.")
//    } else {
//        println("Некорректный номер месяца.")
//    }

    val lowerCaseLetter: Char = 'a'
    val upperCaseLetter: Char = 'Q'
    val number: Char = '1'
    val space: Char = ' '
    val dollar: Char = '$'
//    val ch = '\u0040'
//    println(ch)
//    val ch = 'a'
//    println(ch.code)
    val num = 97
    println(num.toChar())
//    val ch : Char = readln().first()
    val ch1 = 'b'
    val ch2 = ch1 + 1
    val ch3 = ch1 - 2
    var ch = 'A'
    ch += 10
    println(ch)
    println(++ch)
    println(++ch)
    println(--ch)

    println('a' < 'c')
    println('x' >= 'z')
    println('D' == 'D')
    println('Q' != 'q')
    println('A' < 'a')

    val one = '1'
    val isDigit = one.isDigit()
    val isLetter = one.isLetter()
    val capital = 'A'
    val small = 'e'
    val isLetterOrDigit = capital.isLetterOrDigit()
    val isUpperCase = capital.isUpperCase()
    val isLowerCase = capital.isLowerCase()
    val capitalEString = small.uppercase()
    val capitalE = small.uppercaseChar()



}