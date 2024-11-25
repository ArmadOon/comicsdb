package com.armadoon.comicsdb.domain

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "comic_books")
data class ComicBook(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,

    @Column(nullable = false)
    var title: String,

    @Column(length = 1000)
    var description: String? = null,

    @Column(name = "publication_year")
    var publicationYear: Int? = null,

    @Enumerated(EnumType.STRING)
    @Column(name = "rating")
    var rating: ComicRating? = null,

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "comic_book_authors",
        joinColumns = [JoinColumn(name = "comic_book_id")],
        inverseJoinColumns = [JoinColumn(name = "author_id")]
    )
    var authors: MutableSet<Author> = mutableSetOf()
)
