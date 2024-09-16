package com.iggydob.springbootgraphqldemo.service;

import com.iggydob.springbootgraphqldemo.domain.Author;
import com.iggydob.springbootgraphqldemo.domain.Book;
import com.iggydob.springbootgraphqldemo.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author findAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }
}
