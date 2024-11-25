package com.armadoon.comicsdb.repository

import com.armadoon.comicsdb.domain.ComicBook
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface ComicBookRepository : JpaRepository<ComicBook, UUID>{
}