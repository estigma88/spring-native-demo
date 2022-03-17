package com.example.springnativedemo

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "customer")
data class Customer(
    @Id
    @Column(name = "id")
    var id: String,
    @Column(name = "name")
    var name: String
)