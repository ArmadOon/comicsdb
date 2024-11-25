package com.armadoon.comicsdb.repository

import com.armadoon.comicsdb.domain.Author
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface AuthorRepository: JpaRepository<Author, UUID> {
}