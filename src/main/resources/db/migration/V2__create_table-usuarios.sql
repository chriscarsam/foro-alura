CREATE TABLE usuarios (
  id bigint NOT NULL AUTO_INCREMENT,
  email varchar(100)  NOT NULL UNIQUE,
  nombre varchar(100)  NOT NULL,
  password varchar(300) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB;