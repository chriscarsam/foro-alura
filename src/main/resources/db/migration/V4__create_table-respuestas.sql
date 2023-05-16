CREATE TABLE respuestas (
  id bigint NOT NULL AUTO_INCREMENT,
  fecha_creacion datetime(6) NOT NULL,
  mensaje varchar(300) NOT NULL,
  solucion bit(1) NOT NULL,
  topico_id bigint NOT NULL,
  usuario_id bigint NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (usuario_id) REFERENCES usuarios (id),
  FOREIGN KEY (topico_id) REFERENCES topicos (id)
) ENGINE=InnoDB;