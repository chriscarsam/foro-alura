package org.sam.foro.api.domain.usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record IdRegistroUsuario(
        @NotBlank @Pattern(regexp = "^\\d+$") String id //Validando que sea un número
) {
}
