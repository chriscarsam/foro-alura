ALTER TABLE topicos add activo tinyint;
UPDATE topicos SET activo = 1;