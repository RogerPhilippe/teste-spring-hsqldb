package br.com.philippesis.testespringhsqldb.model

import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
@Table(name = "customers")
data class Customers (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = 0,
        @NotNull var name: String,
        @NotNull var email: String)