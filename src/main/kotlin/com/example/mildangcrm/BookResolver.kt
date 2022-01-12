package com.example.mildangcrm

import graphql.kickstart.tools.GraphQLQueryResolver
import graphql.kickstart.tools.GraphQLResolver
import org.springframework.stereotype.Component

@Component
class BookResolver() : GraphQLQueryResolver {
    fun books(): List<Book> {
        val book1 = Book("1", "name1")
        val book2 = Book("2", "name2")
        return listOf(book1, book2)
    }
}
