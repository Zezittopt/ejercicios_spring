CREATE TABLE `productos`.`productos` (
  `id_producto` INT PRIMARY KEY,
  `nombre` VARCHAR(45),
  `precio` DOUBLE,
  `stock` INT);

CREATE TABLE `pedidos`.`pedidos` (
  `id` INT PRIMARY KEY,
  `id_producto` INT,
  `unidades` INT,
  `total` DOUBLE,
  `fecha` DATETIME, 
  CONSTRAINT `id_producto`
  FOREIGN KEY (`id_producto`)
  REFERENCES `productos`.`productos` (`id_producto`));