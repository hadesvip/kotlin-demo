package com.kotlin.demo

import com.kotlin.demo.data.Person
import org.junit.Test

class KotlinTest {

    @Test
    fun demoTest() {

        val personList = listOf(Person("alice"), Person("bob", 23))

        //取年龄的最大值的对象(如果取出来的age为null，默认返回0)
        val person = personList.maxBy { it.age ?: 0 }
        println("年龄最大的人是: $person")

    }

    /**
     * 字符串
     */
    @Test
    fun strTest() {
        val name = "kotlin"
        println("hello,$name")

        val nameList = listOf("java", "kotlin", "python")
        println("hello,${nameList[0]}")

        println("hello, ${if (nameList.size > 0) nameList[0] else "kotlin"}.")
    }

}