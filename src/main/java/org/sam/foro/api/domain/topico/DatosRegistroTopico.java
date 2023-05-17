package org.sam.foro.api.domain.topico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.sam.foro.api.domain.curso.IdRegistroCurso;
import org.sam.foro.api.domain.usuario.IdRegistroUsuario;

public record DatosRegistroTopico(
        @NotBlank String titulo,
        @NotBlank String mensaje,
        @NotNull StatusTopic status,
        @NotNull @Valid IdRegistroUsuario usuario,
        @NotNull @Valid IdRegistroCurso curso
) {
}
