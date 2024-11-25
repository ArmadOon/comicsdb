package com.armadoon.comicsdb.domain

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "authors")
data class Author(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,

    @Column(nullable = false)
    var firstName: String,

    @Column(nullable = false)
    var lastName: String,

    @Column(name = "birth_year")
    var birthYear: Int? = null,

    @ManyToMany(mappedBy = "authors", fetch = FetchType.LAZY)
    var comicBooks: MutableSet<ComicBook> = mutableSetOf()
) {
    // Pro použití v UI nebo logování
    fun getFullName(): String = "$firstName $lastName"
}
