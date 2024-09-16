package com.iggydob.springbootgraphqldemo.repository;

import com.iggydob.springbootgraphqldemo.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
