package org.sam.foro.api.domain.Respuesta;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.sam.foro.api.domain.topico.Topico;
import org.sam.foro.api.domain.usuario.Usuario;

import java.time.LocalDateTime;

@Table(name = "respuesta")
@Entity(name = "Respuesta")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Respuesta {

    private Long id;
    private String mensaje;
    private Topico topico;
    private LocalDateTime fechaCreacion = LocalDateTime.now();
    private Usuario autor;
    private Boolean solucion = false;

}
