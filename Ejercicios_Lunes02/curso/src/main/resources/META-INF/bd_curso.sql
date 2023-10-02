CREATE DATABASE bd_curso;
USE bd_curso;
CREATE TABLE curso (
    codCurso VARCHAR(50) PRIMARY KEY,
    nombre VARCHAR(100),
    duracion INT,
    precio DOUBLE
);