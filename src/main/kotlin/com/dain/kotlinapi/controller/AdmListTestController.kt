package com.dain.kotlinapi.controller

import com.dain.kotlinapi.global.DaoKeyword
import com.dain.kotlinapi.global.SysKeyword
import com.dain.kotlinapi.service.ITestService
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL

@RestController
@RequestMapping("/listapi")
class AdmListTestController(private val testService: ITestService) {

    var param: ResponseEntity<*>? = null


    @GetMapping(SysKeyword.SLASH)
    fun admGetList(): ResponseEntity<*>? {

        param = testService.list()
        return param
    }

}
