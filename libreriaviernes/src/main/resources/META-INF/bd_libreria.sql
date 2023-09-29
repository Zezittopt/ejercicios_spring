use bd_libreria;
CREATE TABLE libro (
    isbn BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    tematica VARCHAR(255)
);
