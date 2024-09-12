package com.iggydob.springbootgraphqldemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id, String name) {

    public static List<Author> authors = Arrays.asList(
            new Author(1, "Georgi Valchanov"),
            new Author(2, "John Doe"),
            new Author(3, "Adam Smith")
    );

    public static Optional<Author> getAuthorById(Integer id) {
        return authors.stream()
                .filter(author -> author.id.equals(id))
                .findFirst();
    }
}
