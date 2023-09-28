# Proyecto Videoclub con Spring Data JPA

Este proyecto es una aplicación de ejemplo que utiliza Spring Boot con Spring Data JPA para interactuar con una base de datos llamada `bd_videoclub`. La base de datos contiene una tabla llamada `peliculas` con las columnas `codigo` (int), `titulo` (Varchar), `nombre_del_director` (Varchar) y `precio` (Int).

## Configuración

### Base de Datos

La aplicación está configurada para utilizar una base de datos H2 en memoria. Puedes ajustar la configuración de la base de datos en el archivo `application.properties`.

```properties
# Configuración de H2 en memoria
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
