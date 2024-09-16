package com.iggydob.springbootgraphqldemo.service;

import com.iggydob.springbootgraphqldemo.domain.Author;
import com.iggydob.springbootgraphqldemo.domain.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();

    Book findBookById(Long bookId);
}
