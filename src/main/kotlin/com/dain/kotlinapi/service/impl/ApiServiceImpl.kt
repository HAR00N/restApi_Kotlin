package com.dain.kotlinapi.service.impl

import com.dain.kotlinapi.global.BaseService
import com.dain.kotlinapi.global.SysKeyword
import com.dain.kotlinapi.repository.ApiRepository
import com.dain.kotlinapi.service.IApiSevice
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.configurationprocessor.json.JSONArray
import org.springframework.boot.configurationprocessor.json.JSONObject
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import kotlin.concurrent.thread

@Service
class ApiServiceImpl(val apiRepository: ApiRepository) : IApiSevice, BaseService() {

    override fun list(): ResponseEntity<*>? {
        val list = apiRepository.findAll()

        return null
    }

    override fun getList(url: URL): JSONArray? {
        val urlConnection = url.openConnection() as HttpURLConnection

        val streamReader = InputStreamReader(urlConnection.getInputStream())
        val buffered = BufferedReader(streamReader)

        val contents = StringBuffer()

        while (true) {
            var line = buffered.readLine() ?: break
            contents.append(line)
        }

        val root: JSONObject = JSONObject(contents.toString())

        val res = JSONObject(root.getJSONArray("body")[0].toString()).getJSONObject("items")
        val item = res.getJSONArray("item")


        buffered.close()
        urlConnection.disconnect()

        return item
    }

    override fun detail(paramText: String?, menuKeyword: String?): HashMap<String, Object>? {
        TODO("Not yet implemented")
    }

    override fun create(paramText: String?): Int? {
        TODO("Not yet implemented")
    }

    override fun update(paramText: String?): Int? {
        TODO("Not yet implemented")
    }
}