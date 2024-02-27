package com.cursojava.curso.controllers;
import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){

        Usuario usuario = new Usuario();

        usuario.setId(id);
        usuario.setNombre("Steve");
        usuario.setApellido("Jobs");
        usuario.setEmail("SteveManzano@gmailo.com");
        usuario.setPassword("dontbeevil");
        usuario.setTelefono("654824714");

        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){

        List<Usuario> usuarios = new ArrayList<Usuario>();

        Usuario usuario = new Usuario();

        usuario.setId(234234L);
        usuario.setNombre("Steve");
        usuario.setApellido("Jobs");
        usuario.setEmail("SteveManzano@gmailo.com");
        usuario.setPassword("dontbeevil");
        usuario.setTelefono("654824714");

        Usuario usuario2 = new Usuario();

        usuario2.setId(456453425L);
        usuario2.setNombre("Froilan");
        usuario2.setApellido("Jewel");
        usuario2.setEmail("ShuPrimoFroilanillo@gmailo.com");
        usuario2.setPassword("yasuni45");
        usuario2.setTelefono("777 444 545");

        Usuario usuario3 = new Usuario();

        usuario3.setId(234234234L);
        usuario3.setNombre("Miguel");
        usuario3.setApellido("Araque");
        usuario3.setEmail("Aranque@gmailo.com");
        usuario3.setPassword("Avenidas45Yeah");
        usuario3.setTelefono("654781454");

        Usuario usuario4 = new Usuario();

        usuario4.setId(234234234L);
        usuario4.setNombre("Jose");
        usuario4.setApellido("Barrios");
        usuario4.setEmail("JosicoErCanute@gmailo.com");
        usuario4.setPassword("breakBeatBeast");
        usuario4.setTelefono("666 5454 777");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);

        return usuarios;
    }


    @RequestMapping(value = "usuariodfgdfgdfgwerwerwer")
    public Usuario editar(){

        Usuario usuario = new Usuario();

        usuario.setNombre("Stevee");
        usuario.setApellido("Jobs");
        usuario.setEmail("SteveManzano@gmailo.com");
        usuario.setPassword("dontbeevil");
        usuario.setTelefono("654824714");

        return usuario;
    }

    @RequestMapping(value = "usuariodfgdfgwerwerwer")
    public Usuario eliminar(){

        Usuario usuario = new Usuario();
        usuario.setNombre("Steve");
        usuario.setApellido("Jobs");
        usuario.setEmail("SteveManzano@gmailo.com");
        usuario.setPassword("dontbeevil");
        usuario.setTelefono("654824714");

        return usuario;
    }

    @RequestMapping(value = "usuariopsdkgpdfkg")
    public Usuario buscar(){

        Usuario usuario = new Usuario();

        usuario.setNombre("Steve");
        usuario.setApellido("Jobs");
        usuario.setEmail("SteveManzano@gmailo.com");
        usuario.setPassword("dontbeevil");
        usuario.setTelefono("654824714");

        return usuario;
    }
}
