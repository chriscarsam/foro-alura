package org.sam.foro.api.controller;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.sam.foro.api.domain.curso.IdRegistroCurso;
import org.sam.foro.api.domain.topico.*;
import org.sam.foro.api.domain.usuario.IdRegistroUsuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    private final TopicoRepository topicoRepository;

    public TopicoController(TopicoRepository topicoRepository){
        this.topicoRepository = topicoRepository;
    }

    @SecurityRequirement(name = "Bearer Authentication")
    @PostMapping
    public ResponseEntity<DatosRespuestaTopico> registrarTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico, UriComponentsBuilder uriComponentsBuilder){
        Topico topico = topicoRepository.save(new Topico(datosRegistroTopico));
        DatosRespuestaTopico datosRespuestaTopico = new DatosRespuestaTopico(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getStatus(), topico.getFechaCreacion(),
                new IdRegistroUsuario(topico.getUsuario().getId().toString()),
                new IdRegistroCurso(topico.getCurso().getId().toString()));

        URI uri = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(uri).body(datosRespuestaTopico);
    }

    @GetMapping
    public ResponseEntity<Page<DatosListadoTopicos>> listadoTopicos(@PageableDefault(size = 5, sort = "id") Pageable paginacion){
        //return topicoRepository.findAll(paginacion).map(DatosListadoTopicos::new);
        return ResponseEntity.ok(topicoRepository.findByActivoTrue(paginacion).map(DatosListadoTopicos::new));
    }

    @SecurityRequirement(name = "Bearer Authentication")
    @PutMapping
    @Transactional
    public ResponseEntity<DatosRespuestaTopico> actualizarTopico(@RequestBody @Valid DatosActualizarTopico datosActualizarTopico){
        Topico topico = topicoRepository.getReferenceById(datosActualizarTopico.id());
        topico.actualizarDatos(datosActualizarTopico);
        return ResponseEntity.ok(new DatosRespuestaTopico(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getStatus(), topico.getFechaCreacion(),
                new IdRegistroUsuario(topico.getUsuario().getId().toString()),
                new IdRegistroCurso(topico.getCurso().getId().toString())));
    }

    @SecurityRequirement(name = "Bearer Authentication")
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity eliminarTopico(@PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        topico.desactivarTopico();
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DatosRespuestaTopico> retornaDatosRopico(@PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        DatosRespuestaTopico datosRespuestaTopico = new DatosRespuestaTopico(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getStatus(), topico.getFechaCreacion(),
                new IdRegistroUsuario(topico.getUsuario().getId().toString()),
                new IdRegistroCurso(topico.getCurso().getId().toString()));
        return ResponseEntity.ok(datosRespuestaTopico);
    }
}
