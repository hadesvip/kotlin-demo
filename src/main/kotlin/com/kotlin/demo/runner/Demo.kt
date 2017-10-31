package com.kotlin.demo.runner

import com.kotlin.demo.data.Person
import java.util.ArrayList
import java.util.function.Consumer

//函数可以写在类之外
fun main(args: Array<String>) {
    println("hello,fun...")

    println(max(2, 1))

    println(min(12, 1))

    val question = "this is a question..."
    println(question)

    //浮点型
    val yearsToComputer = 7.5e6

    //如果变量没有初始化，需要显示的指定它的类型
    val answer: Int
    answer = 42

    //val 对应
    var name = "张三"
    name = "李四"


    val languages = arrayListOf("java")
    languages.add("kotlin")

    println(languages)

    println("---分割线---")

    println(convert2Uppercase("hello,kotlin..."))

    println(convert2Uppercase(22))

    var array = intArrayOf(1, 2, 3, 4, 5)

    for (item in array) {
        println(item)
    }
    println("------------------")

    //通过索引遍历
    for (index: Int in array.indices) {
        println("array[$index] = ${array[index]}")
    }

    println("--------------")
    //同时遍历索引和值
    for ((index, value) in array.withIndex()) {
        println("array[$index]= $value")
    }

    println("----------------")
    println(myPrint("hello"))
    println(myPrint("kotlin"))
    println(myPrint("hello,kotlin"))
    println(myPrint("kotlin,hello"))
    println(myPrint("test"))

    println("----------------")
    var param = 6
    var result = when (param) {
        1 -> {
            println("param =1")
            10
        }
        2 -> {
            println("param =2")
            20
        }
        3, 4, 5 -> {
            println("param  =3 or param =4 or param =5")
            30
        }
        in 6..10 -> {
            println("param between 6 and 10")
            40
        }
        else -> {
            println("other value")
            50
        }
    }
    println(result)
}


fun myPrint(str: String): String {

    return when (str) {
        "hello" -> "HELLO"
        "kotlin" -> "KOTLIN"
        "hello,kotlin", "kotlin,hello" -> "HELLO,KOTLIN"
        else -> "other input"
    }
}

/**
 * any是kotlin中的根,顶层类
 */
fun convert2Uppercase(str: Any): String? {

    //如果是字符串类型
    if (str is String) {
        //str is String,str自动转成String 类型
        return str.toUpperCase()
    }
    return null
}


//函数返回类型位于参数列表之后
fun max(a: Int, b: Int): Int {

    return if (a > b) a else b
}


//单个表达式简洁写法：去掉花括号和return，只有表达式体函数返回类型可以省略，代码块体函数不可以省略
fun min(a: Int, b: Int): Int = if (a > b) b else a


class Demo {

    fun main(args: Array<String>) {
        // println("hello,kotlin-demo")
        val list: List<String> = listOf("hello", "world", "kotlin")

        for (str in list) {
            println(str)
        }

        println("------------------")

        list.forEach(Consumer { println(it) })

        println("-------------------")

        //lambda,方法引用
        list.forEach(System.out::println)

        //Java语法无缝整合
        val personList = ArrayList<Person>()
        personList.add(Person("张三"))
        println(personList)


    }

}