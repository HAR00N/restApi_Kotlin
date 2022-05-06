package com.dain.kotlinapi.controller

import com.dain.kotlinapi.global.DaoKeyword
import com.dain.kotlinapi.global.SysKeyword
import com.dain.kotlinapi.service.IApiSevice
import com.dain.kotlinapi.service.impl.ApiServiceImpl
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.configurationprocessor.json.JSONObject
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

@RestController
@RequestMapping("/api/adm")
class AdmApiController(private val apiService: IApiSevice) {

    @Value(value = "\${api.url}")
    lateinit var apiUrl: String

    @Value(value = "\${api.key}")
    lateinit var apiKey: String

    @GetMapping(SysKeyword.SLASH + "get" + DaoKeyword.COMMON_LIST)
    fun getApiList(): String? {

        val url = URL(apiUrl + SysKeyword.AND + apiKey)
        val item = apiService.getList(url)



        return item.toString()
    }
}