package org.sam.foro.api.infra.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class SecurityFilter extends OncePerRequestFilter {

    private TokenService tokenService;

    public SecurityFilter(TokenService tokenService){
        this.tokenService = tokenService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("este es el inico del filtro");
        var token = request.getHeader("Authorization");
        System.out.println(token);
        if (token != null){
            System.out.println("Validamos que token no es null");
            token = token.replace("Bearer ", "");
            System.out.println(token);
            System.out.println(tokenService.getSubject(token));
        }
        filterChain.doFilter(request, response);
    }
}
