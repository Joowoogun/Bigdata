

select * from tema1;
select name, mbti from info;

select Q1, T1Result1, T1Result2 from tema1;

insert into INFO (id , pw , name)
values('ekd','1234','박씨' );

update tema1 set input1 = 'i' where num1=1;

update student set age=99 where num=2;
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
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
  `pw` VARCHAR(100) NULL DEFAULT NULL,
  `name` VARCHAR(50) NULL DEFAULT NULL,
  `MBTI1` VARCHAR(50) NULL DEFAULT NULL,
  `MBTI2` VARCHAR(50) NULL DEFAULT NULL,
  `MBTI3` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`num`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `mbti`.`tema1`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mbti`.`tema1` (
  `num1` INT NOT NULL AUTO_INCREMENT,
  `Q1` VARCHAR(100) NOT NULL,
  `T1Result1` VARCHAR(100) NULL DEFAULT NULL,
  `T1Result2` VARCHAR(100) NULL DEFAULT NULL,
  `tema1_mbti2` VARCHAR(50) NULL DEFAULT NULL,
  `input1` INT NULL DEFAULT NULL,
  `tema1_mbti1` VARCHAR(45) NULL,
  PRIMARY KEY (`num1`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `mbti`.`tema2`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mbti`.`tema2` (
  `num2` INT NOT NULL AUTO_INCREMENT,
  `Q2` VARCHAR(100) NOT NULL,
  `T2Result1` VARCHAR(100) NULL DEFAULT NULL,
  `T2Result2` VARCHAR(100) NULL DEFAULT NULL,
  `tema2_mbti1` VARCHAR(50) NULL DEFAULT NULL,
  `input2` INT NULL DEFAULT NULL,
  `tema2_mbti2` VARCHAR(45) NULL,
  PRIMARY KEY (`num2`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `mbti`.`tema3`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mbti`.`tema3` (
  `num3` INT NOT NULL AUTO_INCREMENT,
  `Q3` VARCHAR(100) NOT NULL,
  `T3Result1` VARCHAR(100) NULL DEFAULT NULL,
  `T3Result2` VARCHAR(100) NULL DEFAULT NULL,
  `tema3_mbti1` VARCHAR(50) NULL DEFAULT NULL,
  `input3` INT NULL DEFAULT NULL,
  `tema3_mbti2` VARCHAR(45) NULL,
  PRIMARY KEY (`num3`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
