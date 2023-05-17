package org.sam.foro.api.domain.topico;

import org.sam.foro.api.domain.curso.Curso;
import org.sam.foro.api.domain.usuario.Usuario;

import java.time.LocalDateTime;

public record DatosRegistroTopico(
        String titulo,
        String mensaje,
        StatusTopic status,
        Usuario usuario,
        Curso curso
) {
}
