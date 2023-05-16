CREATE TABLE topicos (
  id bigint NOT NULL AUTO_INCREMENT,
  fecha_creacion datetime(6) NOT NULL,
  mensaje varchar(255) NOT NULL,
  status varchar(255) NOT NULL,
  titulo varchar(255) NOT NULL,
  curso_id bigint NOT NULL,
  usuario_id bigint NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (curso_id) REFERENCES cursos (id),
  FOREIGN KEY (usuario_id) REFERENCES usuarios (id)
) ENGINE=InnoDB;