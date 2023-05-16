package org.sam.foro.api.domain.topico;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.sam.foro.api.domain.Respuesta.Respuesta;
import org.sam.foro.api.domain.curso.Curso;
import org.sam.foro.api.domain.usuario.Usuario;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Table(name = "topico")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaCreacion = LocalDateTime.now();
    private StatusTopic status = StatusTopic.NO_RESPONDIDO;
    private Usuario usuario;
    private Curso curso;
    private List<Respuesta> respuestas = new ArrayList<>();

}
