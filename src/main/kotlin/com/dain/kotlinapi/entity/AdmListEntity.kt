package com.dain.kotlinapi.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "framework_resource")
data class AdmListEntity (
    @Id
    @Column(name = "uid")
    var uid: Long = 0,
    @Column(name = "user_id")
    var user_id :String = "",
    @Column(name = "password")
    var password :String = ""
)
