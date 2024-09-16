package com.iggydob.springbootgraphqldemo.service;

import com.iggydob.springbootgraphqldemo.domain.Author;

import java.util.List;

public interface AuthorService {
    List<Author> findAll();

    Author findAuthorById(Long id);
}
