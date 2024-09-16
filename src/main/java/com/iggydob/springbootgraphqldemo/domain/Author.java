package com.iggydob.springbootgraphqldemo.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
@Table(name = "authors", schema = "public")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authorId;
    private String name;

    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "author",
            cascade = CascadeType.ALL)
    private List<Book> books;
}
