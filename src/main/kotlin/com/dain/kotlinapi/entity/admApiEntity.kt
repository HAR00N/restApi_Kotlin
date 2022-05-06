package com.dain.kotlinapi.entity

import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.*

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "apiData")
@Entity
class admApiEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var uid: Int = 0,

    @Column(length = 15)
    var regDt: String = "",

    @Column(length = 100)
    var thumbUrl: String = "",

    @Column(length = 255)
    var title: String = "",

    @Column(length = 100)
    var viewUrl: String
)