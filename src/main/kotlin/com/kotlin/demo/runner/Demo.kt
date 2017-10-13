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