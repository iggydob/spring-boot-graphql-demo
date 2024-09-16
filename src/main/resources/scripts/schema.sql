CREATE TABLE public.books
(
    id       INT          NOT NULL PRIMARY KEY,
    title    VARCHAR(255) NOT NULL,
    year     INT,
    authorId INT
);

CREATE TABLE public.authors
(
    id   INT          NOT NULL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);
