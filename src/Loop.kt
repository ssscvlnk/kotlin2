fun main() {
    println("Начинаем ритуал защиты!")
    var index = 0
    repeat(5) { index ->
        if (index==2) {
            println("Пропускаем шаг ${index+1} из-за машического вмешательства!")
            return@repeat
        }
        println("Заклинание защиты активировано! (Шаг ${index+1})")
    }
    println("Замок защищен!")
}