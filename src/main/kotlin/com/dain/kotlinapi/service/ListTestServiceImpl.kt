package com.dain.kotlinapi.service

import com.dain.kotlinapi.global.BaseService
import com.dain.kotlinapi.repository.ListRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class ListTestServiceImpl(val listRepository: ListRepository) : ITestService, BaseService() {

    override fun list(): ResponseEntity<*> {
        val list = listRepository.findAll()

        return ResponseEntity.ok(list)
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