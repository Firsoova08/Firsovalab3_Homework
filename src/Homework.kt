import kotlin.random.Random
fun main() {
    //1
//    val number = Random.nextInt(1, 50)
//    while (true) {
//        print("Введи число: ")
//        val input = readln().toInt()
//        when{
//            input<number->println("больше")
//            input>number->println("меньше")
//            else->{
//                println("ты угадал число")
//                break
//            }
//        }
//    }
    //2
print("введите строку:")
    val str=readln()
    val bykva="аеёиоуэюяы"
    var count=0
    for (i in str){
        if (i in bykva){
            count++
        }
    }
    println(count)
}