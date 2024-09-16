package com.iggydob.springbootgraphqldemo.service;

import com.iggydob.springbootgraphqldemo.domain.Book;
import com.iggydob.springbootgraphqldemo.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findBookById(Long bookId) {
        return bookRepository.findById(bookId).orElse(null);
    }

}
