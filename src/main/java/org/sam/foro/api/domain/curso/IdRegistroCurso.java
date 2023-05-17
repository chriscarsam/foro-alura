package org.sam.foro.api.domain.curso;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record IdRegistroCurso (
       @NotBlank  @Pattern(regexp = "^\\d+$") String id //Validando que sea un número
){}
