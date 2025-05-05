fun main(){
    useLoop()
}
// use loop
fun useLoop(){
    // 从键盘输入
    var a=readLine()!!.toInt()
    println("for loop:")
    for (i in 1..a){

        println(i)
    }
    println("__________________________")
    // while loop
    println("while loop:")
    var i=1;
    while (i<=a){
        println(i)
        i++
    }
    println("__________________________")
    // do while loop
    println("do while loop:")
    i=1;
    do {
        println(i)
        i++
    }while (i<=a)
    println("__________________________")
}