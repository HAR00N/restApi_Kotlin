package com.dain.kotlinapi.repository

import com.dain.kotlinapi.entity.AdmListEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface ListRepository : JpaRepository<AdmListEntity, Long>