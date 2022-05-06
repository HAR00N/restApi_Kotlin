package com.dain.kotlinapi.repository

import com.dain.kotlinapi.entity.admApiEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ApiRepository :JpaRepository<admApiEntity, Long>