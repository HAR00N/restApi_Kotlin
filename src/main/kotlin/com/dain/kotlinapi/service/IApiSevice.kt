package com.dain.kotlinapi.service

import org.springframework.boot.configurationprocessor.json.JSONArray
import org.springframework.http.ResponseEntity
import java.net.URL

interface IApiSevice {

    fun list(): ResponseEntity<*>?

    fun getList(url: URL): JSONArray?

    fun detail(paramText: String?, menuKeyword: String?): HashMap<String, Object>?

    fun create(paramText: String?): Int?

    fun update(paramText: String?): Int?

}