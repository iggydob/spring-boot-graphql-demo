CREATE TABLE my_db.books
(
    id       INT          NOT NULL PRIMARY KEY,
    title    VARCHAR(255) NOT NULL,
    year     INT,
    authorId INT
);

CREATE TABLE my_db.authors
(
    id   INT          NOT NULL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);
