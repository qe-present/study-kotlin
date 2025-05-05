fun main(){
    // is
    var a=1;
    if (a is Int){
        println("a is Int")
    }
    // !is
//    if (a !is String){
//        println("a is not String")
//    }

}
// 智能类型转换
fun demo(any: Any){
    if(any is String) {
        println(any.length)
    }
}
