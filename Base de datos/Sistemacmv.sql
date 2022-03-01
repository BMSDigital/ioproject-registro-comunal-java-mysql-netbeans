SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `sistemacmv` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `sistemacmv` ;

-- -----------------------------------------------------
-- Table `sistemacmv`.`persona`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `sistemacmv`.`persona` (
  `idpersona` INT NOT NULL AUTO_INCREMENT ,
  `nombre` VARCHAR(20) NOT NULL ,
  `apellido` VARCHAR(20) NOT NULL ,
  `cedula` VARCHAR(20) NOT NULL ,
  `nacionalidad` VARCHAR(25) NOT NULL ,
  `n_cedula` VARCHAR(45) NULL ,
  `dia` VARCHAR(15) NOT NULL ,
  `mes` VARCHAR(15) NOT NULL ,
  `año` VARCHAR(15) NOT NULL ,
  `f_nacimiento` VARCHAR(45) NULL ,
  `parentesco` VARCHAR(25) NOT NULL ,
  `edad` VARCHAR(5) NOT NULL ,
  `sexo` VARCHAR(15) NOT NULL ,
  `estado_civil` VARCHAR(20) NOT NULL ,
  `nivel_instruccion` VARCHAR(15) NOT NULL ,
  `profesion` VARCHAR(20) NOT NULL ,
  `discapacidad` VARCHAR(25) NOT NULL ,
  `cne` VARCHAR(15) NOT NULL ,
  `pension` VARCHAR(15) NOT NULL ,
  `ingreso_mensual` VARCHAR(25) NULL ,
  `area_movil` VARCHAR(10) NOT NULL ,
  `telefono` VARCHAR(15) NOT NULL ,
  `a_telefono` VARCHAR(45) NULL ,
  `email` VARCHAR(35) NOT NULL ,
  `for_email` VARCHAR(25) NOT NULL ,
  PRIMARY KEY (`idpersona`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistemacmv`.`jefe_familiar`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `sistemacmv`.`jefe_familiar` (
  `idpersona` INT NOT NULL ,
  `cuenta` VARCHAR(20) NOT NULL ,
  `numero` VARCHAR(26) NOT NULL ,
  `b_cuenta` VARCHAR(45) NULL ,
  `rif` VARCHAR(25) NOT NULL ,
  `area` VARCHAR(25) NOT NULL ,
  `n_rif` VARCHAR(45) NULL ,
  PRIMARY KEY (`idpersona`) ,
  CONSTRAINT `fk_persona_jefe_familiar`
    FOREIGN KEY (`idpersona` )
    REFERENCES `sistemacmv`.`persona` (`idpersona` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistemacmv`.`grupo_familiar`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `sistemacmv`.`grupo_familiar` (
  `idpersona` INT NOT NULL ,
  `embarazo_precoz` VARCHAR(25) NOT NULL ,
  PRIMARY KEY (`idpersona`) ,
  CONSTRAINT `fk_persona_grupo_familiar`
    FOREIGN KEY (`idpersona` )
    REFERENCES `sistemacmv`.`persona` (`idpersona` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistemacmv`.`ubicacion`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `sistemacmv`.`ubicacion` (
  `idubicacion` INT NOT NULL AUTO_INCREMENT ,
  `estado` VARCHAR(30) NOT NULL ,
  `ciudad` VARCHAR(30) NOT NULL ,
  `municipio` VARCHAR(30) NOT NULL ,
  `parroquia` VARCHAR(30) NOT NULL ,
  PRIMARY KEY (`idubicacion`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistemacmv`.`usuarios`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `sistemacmv`.`usuarios` (
  `idubicacion` INT NOT NULL ,
  `login` VARCHAR(15) NOT NULL ,
  `pasword` VARCHAR(25) NOT NULL ,
  `previlegio` VARCHAR(25) NOT NULL ,
  `nombre` VARCHAR(25) NOT NULL ,
  `apellido` VARCHAR(25) NOT NULL ,
  `nivel_acceso` VARCHAR(25) NOT NULL ,
  `sexo` VARCHAR(15) NOT NULL ,
  `email` VARCHAR(35) NOT NULL ,
  `dia` VARCHAR(20) NOT NULL ,
  `mes` VARCHAR(20) NOT NULL ,
  `año` VARCHAR(20) NOT NULL ,
  `f_nacimiento` VARCHAR(45) NULL ,
  `for_email` VARCHAR(20) NOT NULL ,
  `f_email` VARCHAR(45) NULL ,
  `area_movil` VARCHAR(25) NOT NULL ,
  `telefono` VARCHAR(25) NOT NULL ,
  `a_telefono` VARCHAR(45) NULL ,
  PRIMARY KEY (`idubicacion`) ,
  UNIQUE INDEX `login_UNIQUE` (`login` ASC) ,
  CONSTRAINT `fk_ubicacion_usuarios`
    FOREIGN KEY (`idubicacion` )
    REFERENCES `sistemacmv`.`ubicacion` (`idubicacion` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistemacmv`.`situacion_economica`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `sistemacmv`.`situacion_economica` (
  `idubicacion` INT NOT NULL ,
  `trabajas` VARCHAR(15) NOT NULL ,
  `institucion` VARCHAR(30) NOT NULL ,
  `ingreso_familiar` VARCHAR(35) NOT NULL ,
  `act_comercial_vivienda` VARCHAR(20) NOT NULL ,
  `ventas_de` VARCHAR(30) NOT NULL ,
  `ing_mensual` VARCHAR(10) NOT NULL ,
  `lph` VARCHAR(25) NOT NULL ,
  `familiar_padezcan_enf` VARCHAR(45) NOT NULL ,
  `cual_enfermedad` VARCHAR(30) NOT NULL ,
  `ayuda_familiar_enf` VARCHAR(15) NOT NULL ,
  `cual_ayuda` VARCHAR(25) NOT NULL ,
  `cant_exclusion` VARCHAR(15) NOT NULL ,
  `per_exclusion` VARCHAR(20) NOT NULL ,
  PRIMARY KEY (`idubicacion`) ,
  CONSTRAINT `fk_ubicacion_situacion_economica`
    FOREIGN KEY (`idubicacion` )
    REFERENCES `sistemacmv`.`ubicacion` (`idubicacion` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistemacmv`.`servicios`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `sistemacmv`.`servicios` (
  `idservicios` INT NOT NULL AUTO_INCREMENT ,
  `aguas_blanca` VARCHAR(35) NOT NULL ,
  `tanques` VARCHAR(15) NOT NULL ,
  `litros` VARCHAR(20) NOT NULL ,
  `pipotes` VARCHAR(15) NOT NULL ,
  `cuantos` VARCHAR(20) NOT NULL ,
  `agua_servida` VARCHAR(20) NOT NULL ,
  `gas` VARCHAR(20) NOT NULL ,
  `empresa_suministra` VARCHAR(20) NOT NULL ,
  `cuanto_cilindro` VARCHAR(15) NOT NULL ,
  `precio_cilindro` VARCHAR(20) NOT NULL ,
  `sistema_electrico` VARCHAR(255) NOT NULL ,
  `recolecion_basura` VARCHAR(15) NOT NULL ,
  `telefonia` VARCHAR(15) NOT NULL ,
  `transporte` VARCHAR(15) NOT NULL ,
  PRIMARY KEY (`idservicios`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistemacmv`.`situacion_vivienda`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `sistemacmv`.`situacion_vivienda` (
  `idservicios` INT NOT NULL ,
  `condiciones_terreno` VARCHAR(15) NOT NULL ,
  `situacion_viviendacol` VARCHAR(25) NOT NULL ,
  `tipo_vivienda` VARCHAR(25) NOT NULL ,
  `habitacion_vivienda` VARCHAR(255) NOT NULL ,
  `enseres_vivienda` VARCHAR(255) NOT NULL ,
  `tipo_paredes` VARCHAR(45) NOT NULL ,
  `tipo_techo` VARCHAR(45) NOT NULL ,
  `cantidad_habitaciones` VARCHAR(45) NOT NULL ,
  `condiciones_vivienda` VARCHAR(45) NOT NULL ,
  `presencia_roedores` VARCHAR(45) NOT NULL ,
  `acepto1` VARCHAR(15) NOT NULL ,
  `animales_domestico` VARCHAR(45) NOT NULL ,
  `acepto2` VARCHAR(35) NOT NULL ,
  PRIMARY KEY (`idservicios`) ,
  CONSTRAINT `fk_servicio_situacion_economica`
    FOREIGN KEY (`idservicios` )
    REFERENCES `sistemacmv`.`servicios` (`idservicios` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistemacmv`.`situacion_comunitaria`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `sistemacmv`.`situacion_comunitaria` (
  `idsituacion_comunitaria` INT NOT NULL AUTO_INCREMENT ,
  `resolver_problemas` VARCHAR(255) NOT NULL ,
  `quien_resolvera` VARCHAR(255) NOT NULL ,
  `tipo_proyecto` VARCHAR(255) NOT NULL ,
  `como_apoyaria` VARCHAR(255) NOT NULL ,
  `censo_energetico` VARCHAR(255) NOT NULL ,
  `aspecto_ventajosos` VARCHAR(255) NOT NULL ,
  `problemas_debilidades` VARCHAR(255) NOT NULL ,
  `mejoramiento` VARCHAR(255) NOT NULL ,
  `opciones` VARCHAR(255) NOT NULL ,
  `otro` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`idsituacion_comunitaria`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistemacmv`.`participacion_ciudadana`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `sistemacmv`.`participacion_ciudadana` (
  `idparticipacion_ciudadana` INT NOT NULL AUTO_INCREMENT ,
  `mecanismo_informacion` VARCHAR(255) NOT NULL ,
  `cuales` VARCHAR(45) NULL ,
  `servicios_comunitario` VARCHAR(255) NOT NULL ,
  `cuales2` VARCHAR(45) NULL ,
  `existe_organizaciones` VARCHAR(15) NOT NULL ,
  `participa_alguna` VARCHAR(15) NOT NULL ,
  `participa_algun_miembro` VARCHAR(15) NOT NULL ,
  `cuales_misiones` VARCHAR(15) NOT NULL ,
  `otro` VARCHAR(45) NOT NULL ,
  `estan_interviniendo` VARCHAR(15) NOT NULL ,
  `estas_deacuerdo` VARCHAR(15) NOT NULL ,
  `tienes_info` VARCHAR(15) NOT NULL ,
  `estaria_dispuesto` VARCHAR(15) NOT NULL ,
  `participa_usted` VARCHAR(15) NOT NULL ,
  `deno_respuesta` VARCHAR(255) NULL ,
  PRIMARY KEY (`idparticipacion_ciudadana`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistemacmv`.`registros`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `sistemacmv`.`registros` (
  `idregistros` INT NOT NULL AUTO_INCREMENT ,
  `idjefe_familiar` INT NOT NULL ,
  `idgrupo_familiar` INT NOT NULL ,
  `idsituacion_vivienda` INT NOT NULL ,
  `idusuarios` INT NOT NULL ,
  `idsituacion_economica` INT NOT NULL ,
  `idsituacion_comunitaria` INT NOT NULL ,
  `idparticipacion_ciudadana` INT NOT NULL ,
  `fecha_ingreso` DATE NOT NULL ,
  `fecha_salida` DATE NOT NULL ,
  `estado` VARCHAR(15) NOT NULL ,
  PRIMARY KEY (`idregistros`) ,
  INDEX `fk_registro_jefe_familiar_idx` (`idjefe_familiar` ASC) ,
  INDEX `fk_registro_grupo_familiar_idx` (`idgrupo_familiar` ASC) ,
  INDEX `fk_registro_situacion_vivienda_idx` (`idsituacion_vivienda` ASC) ,
  INDEX `fk_registro_usuarios_idx` (`idusuarios` ASC) ,
  INDEX `fk_registro_situacion_economica_idx` (`idsituacion_economica` ASC) ,
  INDEX `fk_registro_situacion_comunitaria_idx` (`idsituacion_comunitaria` ASC) ,
  INDEX `fk_registro_participacion_ciudadana_idx` (`idparticipacion_ciudadana` ASC) ,
  CONSTRAINT `fk_registro_jefe_familiar`
    FOREIGN KEY (`idjefe_familiar` )
    REFERENCES `sistemacmv`.`jefe_familiar` (`idpersona` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_registro_grupo_familiar`
    FOREIGN KEY (`idgrupo_familiar` )
    REFERENCES `sistemacmv`.`grupo_familiar` (`idpersona` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_registro_situacion_vivienda`
    FOREIGN KEY (`idsituacion_vivienda` )
    REFERENCES `sistemacmv`.`situacion_vivienda` (`idservicios` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_registro_usuarios`
    FOREIGN KEY (`idusuarios` )
    REFERENCES `sistemacmv`.`usuarios` (`idubicacion` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_registro_situacion_economica`
    FOREIGN KEY (`idsituacion_economica` )
    REFERENCES `sistemacmv`.`situacion_economica` (`idubicacion` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_registro_situacion_comunitaria`
    FOREIGN KEY (`idsituacion_comunitaria` )
    REFERENCES `sistemacmv`.`situacion_comunitaria` (`idsituacion_comunitaria` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_registro_participacion_ciudadana`
    FOREIGN KEY (`idparticipacion_ciudadana` )
    REFERENCES `sistemacmv`.`participacion_ciudadana` (`idparticipacion_ciudadana` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

USE `sistemacmv` ;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
