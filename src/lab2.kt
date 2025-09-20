fun main() {
//    println("введите первое число:")
//    val num = readln().toInt()
//    println("введите второе число:")
//    val num2 = readln().toInt()
//    if (num>num2) {
//        println("Первое число больше")
//    } else {
//        println("Второе число больше")
//    }
//    val max = if (num>num2) num else num2
//    println("Максимальное число: $max")
//    val age = readln().toInt()
//    val status = if (age>=18) "Совершеннолетний" else "Несовершеннолетний"
//    println(status)
//    print("Введите урон: ")
//    var damage = readln().toInt()
//    print("Щит активен? (введите да или нет): ")
//    val answer = readln()
//    val dam = if (answer == "да") damage/2 else damage
//    println("Полученный урон: $dam")
    print("Введите наш уровень: ")
    val level = readln().toInt()
    print("У вас есть VIP-cтатус? (true/false): ")
    val hasvip = readln().toBoolean()
    if ((level >= 30 && hasvip) || level >= 50) {
        println("Доступ разрешен!")
    } else {
        println("Доступ запрещен!")
    }

}