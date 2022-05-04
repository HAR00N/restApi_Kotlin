package com.dain.kotlinapi.service

import org.springframework.http.ResponseEntity

interface ITestService {

    fun list () :ResponseEntity<*>?

    fun detail (paramText :String?, menuKeyword :String?) :HashMap<String, Object>?

    fun create (paramText :String?) :Int?

    fun update (paramText :String?) :Int?
}
