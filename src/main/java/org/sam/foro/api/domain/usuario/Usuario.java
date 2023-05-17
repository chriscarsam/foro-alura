package org.sam.foro.api.domain.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.sam.foro.api.domain.topico.Topico;

import java.util.ArrayList;
import java.util.List;

@Table(name = "usuarios")
@Entity(name = "Usuario")
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String password;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    private List<Topico> topicos;

    public Usuario(){
        this.topicos = new ArrayList<>();
    }

    public Usuario(Usuario usuario) {
        this.id = usuario.getId();
    }
}
