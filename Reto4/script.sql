
CREATE SCHEMA IF NOT EXISTS `billetera` DEFAULT CHARACTER SET utf8 ;
USE `billetera` ;

-- -----------------------------------------------------
-- Table `billetera`.`document_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `billetera`.`document_type` (
  `code` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`code`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `billetera`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `billetera`.`user` (
  `id` INT NOT NULL,
  `name` VARCHAR(50) NULL,
  `document` VARCHAR(15) NULL,
  `phone_number` VARCHAR(15) NULL,
  `brith_date` DATE NULL,
  `addresss` VARCHAR(60) NULL,
  `gender` VARCHAR(10) NULL,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `email` VARCHAR(60) NULL,
  `is_active` TINYINT NULL,
  `timestamp` DATE NULL,
  `last_update` DATE NULL,
  `document_type_code` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_user_document_type`
    FOREIGN KEY (`document_type_code`)
    REFERENCES `billetera`.`document_type` (`code`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `billetera`.`wallet`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `billetera`.`wallet` (
  `id` INT NOT NULL,
  `amount` BIGINT NULL,
  `timestamp` DATE NULL,
  `user_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_wallet_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `billetera`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `billetera`.`pocket`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `billetera`.`pocket` (
  `id` INT NOT NULL,
  `name` VARCHAR(60) NULL,
  `amount_pocket` INT NULL,
  `timestamp` DATE NULL,
  `user_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_pocket_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `billetera`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `billetera`.`transaction_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `billetera`.`transaction_type` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `is_debit` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `billetera`.`wallet_log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `billetera`.`wallet_log` (
  `id` INT NOT NULL,
  `amount` BIGINT NULL,
  `timestamp` DATE NULL,
  `wallet_id` INT NOT NULL,
  `transaction_type_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_wallet_log_wallet1`
    FOREIGN KEY (`wallet_id`)
    REFERENCES `billetera`.`wallet` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_wallet_log_transaction_type1`
    FOREIGN KEY (`transaction_type_id`)
    REFERENCES `billetera`.`transaction_type` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `billetera`.`pocket_log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `billetera`.`pocket_log` (
  `id` INT NOT NULL,
  `amount` BIGINT NULL,
  `timestamp` DATE NULL,
  `pocket_id` INT NOT NULL,
  `transaction_type_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_pocket_log_pocket1`
    FOREIGN KEY (`pocket_id`)
    REFERENCES `billetera`.`pocket` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pocket_log_transaction_type1`
    FOREIGN KEY (`transaction_type_id`)
    REFERENCES `billetera`.`transaction_type` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


