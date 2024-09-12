package com.iggydob.springbootgraphqldemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id, String name, Integer pageCount) {
    public static List<Book> books = Arrays.asList(
            new Book(1, "Bible", 604),
            new Book(2, "Harry Potter", 700),
            new Book(3, "Foobar", 100),
            new Book(4, "Spring Boot", 344)
    );

    public static Optional<Book> getBookById(Integer id) {
        return books.stream()
                .filter(book -> book.id.equals(id))
                .findFirst();
    }
}
