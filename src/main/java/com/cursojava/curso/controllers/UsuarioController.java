package com.cursojava.curso.controllers;
import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){

        Usuario usuario = new Usuario();

        usuario.setId(id);
        usuario.setNobmre("Steve");
        usuario.setApellido("Jobs");
        usuario.setEmail("SteveManzano@gmailo.com");
        usuario.setPassword("dontbeevil");
        usuario.setTelefono("654824714");

        return usuario;
    }


    @RequestMapping(value = "usuariodfgdfgdfgwerwerwer")
    public Usuario editar(){

        Usuario usuario = new Usuario();

        usuario.setNobmre("Stevee");
        usuario.setApellido("Jobs");
        usuario.setEmail("SteveManzano@gmailo.com");
        usuario.setPassword("dontbeevil");
        usuario.setTelefono("654824714");

        return usuario;
    }

    @RequestMapping(value = "usuariodfgdfgwerwerwer")
    public Usuario eliminar(){

        Usuario usuario = new Usuario();
        usuario.setNobmre("Steve");
        usuario.setApellido("Jobs");
        usuario.setEmail("SteveManzano@gmailo.com");
        usuario.setPassword("dontbeevil");
        usuario.setTelefono("654824714");

        return usuario;
    }

    @RequestMapping(value = "usuariodfgdfgwerwerwerwer")
    public Usuario buscar(){

        Usuario usuario = new Usuario();

        usuario.setNobmre("Steve");
        usuario.setApellido("Jobs");
        usuario.setEmail("SteveManzano@gmailo.com");
        usuario.setPassword("dontbeevil");
        usuario.setTelefono("654824714");

        return usuario;
    }
}
