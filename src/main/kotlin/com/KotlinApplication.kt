package com

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.support.SpringBootServletInitializer

/**
 * Created by wangyong on 2017/6/29.
 */
@SpringBootApplication
open class KotlinApplication : SpringBootServletInitializer() {
    override fun configure(builder: SpringApplicationBuilder?): SpringApplicationBuilder {
        return super.configure(builder)
    }
}

//fun main(args: Array<String>) {
//    SpringApplication.run(Application::class.java, *args)
//}

