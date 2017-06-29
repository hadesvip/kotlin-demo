package com.controller

import com.domain.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Created by wangyong on 2017/6/29.
 */
@RestController
class UserController {

    /**
     * 获取用户信息
     */
    @GetMapping("/getUser")
    fun getUser(@RequestParam("name") name: String): User {
        return User(1, "hello,$name")
    }

}