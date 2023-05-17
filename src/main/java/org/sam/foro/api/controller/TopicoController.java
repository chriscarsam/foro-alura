package org.sam.foro.api.controller;

import org.sam.foro.api.domain.topico.DatosRegistroTopico;
import org.sam.foro.api.domain.topico.Topico;
import org.sam.foro.api.domain.topico.TopicoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    private TopicoRepository topicoRepository;

    public TopicoController(TopicoRepository topicoRepository){
        this.topicoRepository = topicoRepository;
    }

    @PostMapping
    public void registrarTopico(@RequestBody DatosRegistroTopico datosRegistroTopico){
       topicoRepository.save(new Topico(datosRegistroTopico));
    }
}
