-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema mbti
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mbti
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mbti` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `mbti` ;

-- -----------------------------------------------------
-- Table `mbti`.`info`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mbti`.`info` (
  `num` INT NOT NULL AUTO_INCREMENT,
  `id` VARCHAR(50) NOT NULL,
  `pw` VARCHAR(100) NULL,
  `name` VARCHAR(50) NULL,
  `MBTI1` VARCHAR(50) NULL,
  `MBTI2` VARCHAR(50) NULL,
  `MBTI3` VARCHAR(50) NULL,
  PRIMARY KEY (`num`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mbti`.`tema3`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mbti`.`tema3` (
  `num3` INT NOT NULL AUTO_INCREMENT,
  `Q3` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`num3`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mbti`.`tema2`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mbti`.`tema2` (
  `num2` INT NOT NULL AUTO_INCREMENT,
  `Q2` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`num2`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mbti`.`tema1`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mbti`.`tema1` (
  `num1` INT NOT NULL AUTO_INCREMENT,
  `Q1` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`num1`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

select * from info;
select name, mbti from info;

insert into INFO (id , pw , name)
values('ekd','1234','박씨' );



