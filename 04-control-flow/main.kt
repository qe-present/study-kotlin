fun main(){
    gg()
}
// use if
fun tt(){
    // 从键盘输入
    var a=readLine()!!.toInt()
    if(a==1){
        println("a=1")
    }
    else if(a in 2..100){
        println("a is 2 to 100")
    }
    else{
        println("a=3")
    }
}
// when
fun gg(){
    // 从键盘输入
    var a=readLine()!!.toInt()
    when(a){
        1->println("a=1")
        in 2..100->println("a is 2 to 100")
        else->println("a is not 1 or 2 to 100")
    }
}