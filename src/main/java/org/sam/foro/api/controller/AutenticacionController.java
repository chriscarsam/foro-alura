package org.sam.foro.api.controller;

import jakarta.validation.Valid;
import org.sam.foro.api.domain.usuario.DatosAutenticacionUsuario;
import org.sam.foro.api.domain.usuario.Usuario;
import org.sam.foro.api.infra.security.DatosJWTToken;
import org.sam.foro.api.infra.security.TokenService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

    private AuthenticationManager authenticationManager;
    private TokenService tokenService;

    public AutenticacionController(AuthenticationManager authenticationManager, TokenService tokenService){
        this.authenticationManager = authenticationManager;
        this.tokenService = tokenService;
    }

    @PostMapping
    public ResponseEntity<DatosJWTToken> autenticarUsuario(@RequestBody @Valid DatosAutenticacionUsuario datosAutenticacionUsuario){
        Authentication authToken = new UsernamePasswordAuthenticationToken(datosAutenticacionUsuario.email(),
                datosAutenticacionUsuario.password());
        var usuarioAutendicado  = authenticationManager.authenticate(authToken);
        var JWTtoken = tokenService.generarToken((Usuario) usuarioAutendicado.getPrincipal());
        return ResponseEntity.ok(new DatosJWTToken(JWTtoken));
    }
}
