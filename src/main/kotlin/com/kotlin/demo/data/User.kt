package com.kotlin.demo.data

/**
 * val声明的属性只有一个getter方法
 * var声明的属性，有getter和setter方法
 */
class User {
    val name: String
        get() {
            return name
        }
    var isMarried: Boolean
        get() {
            return isMarried
        }
        set(value) {
            isMarried = value
        }

}