package com.iggydob.springbootgraphqldemo.resource;

import com.iggydob.springbootgraphqldemo.domain.Author;
import com.iggydob.springbootgraphqldemo.domain.Book;
import com.iggydob.springbootgraphqldemo.service.AuthorServiceImpl;
import com.iggydob.springbootgraphqldemo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class BookResource {

    private final BookService bookService;
    private final AuthorServiceImpl authorServiceImpl;

    @QueryMapping
    public List<Book> findAllBooks() {
        return bookService.findAll();
    }

    @QueryMapping
    public Book bookById(@Argument Long bookId) {
        return bookService.findBookById(bookId);
    }

    @SchemaMapping
    public Optional<Author> author(Book book) {
        return Optional.ofNullable(authorServiceImpl.findAuthorById(book.getAuthor().getAuthorId()));
    }
}
