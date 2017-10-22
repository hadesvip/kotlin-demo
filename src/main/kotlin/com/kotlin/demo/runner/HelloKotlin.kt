//对于kotlin来说 package是逻辑上面的概念，Java是物理上面的概念
package com.kotlin.demo.runner

//可以设置别名
import  com.kotlin.demo.service.multiply as myMultiply

fun main(args: Array<String>) {

    println(sum(1, 2))

    println(sum2(3, 5))

    myPrint(1, 2)

//
//    var x = 10
//    var y: Byte = 20
//
//    x = y.toInt()

    println(myMultiply(1, 2))

    println("-------------------")
    val m = intArrayOf(1, 2, 3)

    m.set(0, 2)

    for (item in m) {
        println(item)
    }
    var x = 10
    var y = 20

    var min: Int
    var max: Int

    max = if (x > y) x else y
    min = if (x > y) y else x


}

fun sum(a: Int, b: Int): Int {
    return a + b
}

//可以省略Int
fun sum2(a: Int, b: Int) = a + b

//不返回任何结果(1不写任何返回值，2 加上一个Unit)
fun myPrint(a: Int, b: Int): Unit {
//    println(a + b)
    //字符串模板
    println("$a+$b=${a + b}")
}

fun convert2Int(str: String): Int? {
    try {
        return str.toInt()
    } catch (ex: NumberFormatException) {
        return null
    }
}

fun printMultiply(a: String, b: String) {
    val a2Int = convert2Int(a)
    var b2Int = convert2Int(b)
    if (null != a2Int && null != b2Int) {
        println(a2Int * b2Int)
    } else {
        println("param is not Int")
    }
}







