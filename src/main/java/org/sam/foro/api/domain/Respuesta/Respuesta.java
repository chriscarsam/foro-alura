package org.sam.foro.api.domain.Respuesta;

import jakarta.persistence.*;
import lombok.*;
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
    @JoinColumn(name = "fk_topico_id")
    private Topico topico;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_usuario_id")
    private Usuario usuario;

    private Boolean solucion = false;

    @PrePersist
    public void prePersist(){
        this.fechaCreacion = LocalDateTime.now();
    }
}
