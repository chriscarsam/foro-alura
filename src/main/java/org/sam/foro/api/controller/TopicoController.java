package org.sam.foro.api.controller;

import jakarta.validation.Valid;
import org.sam.foro.api.domain.topico.DatosListadoTopicos;
import org.sam.foro.api.domain.topico.DatosRegistroTopico;
import org.sam.foro.api.domain.topico.Topico;
import org.sam.foro.api.domain.topico.TopicoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    private TopicoRepository topicoRepository;

    public TopicoController(TopicoRepository topicoRepository){
        this.topicoRepository = topicoRepository;
    }

    @PostMapping
    public void registrarTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico){
       topicoRepository.save(new Topico(datosRegistroTopico));
    }

    @GetMapping
    public Page<DatosListadoTopicos> listadoTopicos(@PageableDefault(size = 5) Pageable paginacion){
        return topicoRepository.findAll(paginacion).map(DatosListadoTopicos::new);
    }
}
