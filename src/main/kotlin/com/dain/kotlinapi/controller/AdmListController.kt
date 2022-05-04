package com.dain.kotlinapi.controller

import com.dain.kotlinapi.entity.AdmListEntity
import com.dain.kotlinapi.repository.ListRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/listapi")
class AdmListController (val listRepository: ListRepository) {

    @GetMapping()
    fun admGetList() : ResponseEntity<*> {
        val users = listRepository.findAll()
        return ResponseEntity.ok(users)
    }

    @PostMapping()
    fun admPostList(@RequestBody admListEntity: AdmListEntity) :ResponseEntity<*> {
        val res = listRepository.save(admListEntity)
        return ResponseEntity.ok(res)
    }
}