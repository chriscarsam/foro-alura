package org.sam.foro.api.domain.Respuesta;

import jakarta.persistence.*;
import lombok.*;
import org.sam.foro.api.domain.curso.Curso;
import org.sam.foro.api.domain.topico.Topico;
import org.sam.foro.api.domain.usuario.Usuario;

import java.time.LocalDateTime;

@Table(name = "respuestas")
@Entity(name = "Respuesta")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensaje;

    @ManyToOne(fetch = FetchType.LAZY)
    private Topico topico;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;

    private Boolean solucion;

    @PrePersist
    public void prePersist(){
        this.fechaCreacion = LocalDateTime.now();
        this.solucion = false;
    }

}
