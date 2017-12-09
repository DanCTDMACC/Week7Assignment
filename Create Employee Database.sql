CREATE SCHEMA `employee` ;

CREATE TABLE `employee`.`employee` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `firstname` VARCHAR(45) NOT NULL,
  `lastname` VARCHAR(45) NOT NULL,
  `wage` INT NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `state` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

INSERT INTO `employee`.`employee` (`firstname`, `lastname`, `wage`, `city`, `state`) VALUES ('Danh', 'Tran', '30', 'Des Moines', 'IA');
INSERT INTO `employee`.`employee` (`firstname`, `lastname`, `wage`, `city`, `state`) VALUES ('Bill', 'Gates', '40', 'Ankeny', 'IA');
INSERT INTO `employee`.`employee` (`firstname`, `lastname`, `wage`, `city`, `state`) VALUES ('Steve', 'Jobs', '40', 'Indianola', 'IA');
