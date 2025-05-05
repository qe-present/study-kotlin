// 数字
// 整数类型 Int Long Byte Short
fun ILBS(){
    // Int
    var a=1;
    // Long
    var b=1L;
    // byte
    var c:Byte=2;
    // short
    var d:Short=3;
}
// 浮点类型 Float Double
fun F(){
    // Float
    var a=1.0f;
    // Double
    var b=1.0;
}
// 字符类型 Char
fun C(){
    // Char
    var a='a';
    // 字符串类型 String
    var b="abc";
    // 布尔类型 Boolean
    var c=true;
}
// 空类型 Unit
fun U(){
    // Unit
    var a=Unit;
    // Nothing
    var b:Nothing?=null;
}
// array 数组
fun A(){
    // 数组
    var a= arrayOf(1,2,3);
    // 数组长度
    var b=a.size;
    // 数组下标
    var c=a[0];
    // 数组遍历
    for (i in a){
        println(i);
    }
    // intArray
    var d= intArrayOf(1,2,3);
    // DoubleArray
    var e= doubleArrayOf(1.0,2.0,3.0);
    // toMap
    var f= arrayOf("a" to 1,"b" to 2).toMap();
    // toList
    var g= arrayOf(1,2,3).toList();
    // toSet
    var h= arrayOf(1,2,3).toSet();

}
// 字符串模板
fun S(){
    // 字符串模板
    var a=1;
    var b="a";
    var c="a=$a";
    // 字符串拼接
    var d="a=$a,b=$b";
    // 多行字符串
    var e="""
        a=$a
        b=$b
        """.trimIndent();
}