package com.iggydob.springbootgraphqldemo.resource;

import com.iggydob.springbootgraphqldemo.domain.Author;
import com.iggydob.springbootgraphqldemo.domain.Book;
import com.iggydob.springbootgraphqldemo.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class AuthorResource {
    private final AuthorService authorService;

    @QueryMapping
    public List<Author> findAllAuthors() {
        return authorService.findAll();
    }

    @QueryMapping
    public Author authorById(@Argument Long authorId) {
        return authorService.findAuthorById(authorId);
    }
}
