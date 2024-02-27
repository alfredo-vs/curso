package com.cursojava.curso.models;

public class Usuario {




    private Long id;

    private String nobmre;
    private String apellido;
    private String email;
    private String telefono;
    private String password;


//**********************************************************************************************************************

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    public String getNobmre() {
        return nobmre;
    }

    public void setNobmre(String nobmre) {
        this.nobmre = nobmre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }







}
