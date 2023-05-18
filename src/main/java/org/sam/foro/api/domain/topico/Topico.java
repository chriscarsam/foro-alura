package org.sam.foro.api.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.sam.foro.api.domain.Respuesta.Respuesta;
import org.sam.foro.api.domain.curso.Curso;
import org.sam.foro.api.domain.usuario.Usuario;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    @Enumerated(EnumType.STRING)
    private StatusTopic status;

    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    private Curso curso;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "topico_id")
    private List<Respuesta> respuestas;

    @PrePersist
    public void prePersist(){
        this.fechaCreacion = LocalDateTime.now();
    }

    public Topico() {
        this.respuestas = new ArrayList<>();
        this.status = StatusTopic.NO_RESPONDIDO;
    }

    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.status = datosRegistroTopico.status();
        this.usuario = new Usuario(datosRegistroTopico.usuario());
        this.curso = new Curso(datosRegistroTopico.curso());
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        this.titulo = datosActualizarTopico.titulo();
        this.mensaje = datosActualizarTopico.mensaje();
        this.status = datosActualizarTopico.status();
    }
}
