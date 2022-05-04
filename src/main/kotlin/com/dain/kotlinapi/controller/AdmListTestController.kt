package com.dain.kotlinapi.controller

import com.dain.kotlinapi.global.DaoKeyword
import com.dain.kotlinapi.global.SysKeyword
import com.dain.kotlinapi.service.ITestService
import org.springframework.beans.factory.annotation.Value

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/listapi")
class AdmListTestController(private val testService: ITestService) {

    var param: ResponseEntity<*>? = null

    @GetMapping(SysKeyword.SLASH)
    fun admGetList(): ResponseEntity<*>? {

        param = testService.list()
        return param
    }

    @GetMapping(SysKeyword.SLASH + DaoKeyword.COMMON_LIST)
    fun getApiList(): String? {

        @Value("\${api.url}")
        var apiUrl: String

        return null
    }
}
