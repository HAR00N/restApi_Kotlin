package com.dain.kotlinapi.controller

import com.dain.kotlinapi.global.SysKeyword
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

class HelloController {

    @RestController
    @RequestMapping("/api/v1")
    class WorldApi {

        @GetMapping("/")
        fun readWorld() :String {
            return SysKeyword().SLASH
        }

    }
}