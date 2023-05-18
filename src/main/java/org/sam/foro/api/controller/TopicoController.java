package org.sam.foro.api.controller;

import jakarta.validation.Valid;
import org.sam.foro.api.domain.topico.DatosListadoTopicos;
import org.sam.foro.api.domain.topico.DatosRegistroTopico;
import org.sam.foro.api.domain.topico.Topico;
import org.sam.foro.api.domain.topico.TopicoRepository;
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
    public List<DatosListadoTopicos> listadoTopicos(){
        return topicoRepository.findAll().stream().map(DatosListadoTopicos::new).toList();
    }
}
