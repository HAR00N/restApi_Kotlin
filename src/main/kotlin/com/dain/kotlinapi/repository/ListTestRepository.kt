package com.dain.kotlinapi.repository

import com.dain.kotlinapi.entity.AdmListTestEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ListTestRepository : JpaRepository<AdmListTestEntity, Long>