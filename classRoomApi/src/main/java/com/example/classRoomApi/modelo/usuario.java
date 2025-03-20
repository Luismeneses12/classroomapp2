package com.example.classRoomApi.modelo;

import ayudas.Tipo_de_usurio;

public class usuario {

    private Integer  id_usurairo;
    private String nombre ;
    private  String correo_eletronico ;
    private  String contrazena;
    private  String telefono;
    private Tipo_de_usurio tipo_usuario ;


    public usuario() {
    }

    public usuario(Integer id_usurairo, String nombre, String correo_eletronico, String contrazeña, String telefono, Tipo_de_usurio tipo_usuario) {
        this.id_usurairo = id_usurairo;
        this.nombre = nombre;
        this.correo_eletronico = correo_eletronico;
        this.contrazena = contrazeña;
        this.telefono = telefono;
        this.tipo_usuario = tipo_usuario;
    }

    public Integer getId_usurairo() {
        return id_usurairo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo_eletronico() {
        return correo_eletronico;
    }

    public String getContrazeña() {
        return contrazena;
    }

    public String getTelefono() {
        return telefono;
    }

    public Tipo_de_usurio getTipo_usuario() {
        return tipo_usuario;
    }

    public void setId_usurairo(Integer id_usurairo) {
        this.id_usurairo = id_usurairo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo_eletronico(String correo_eletronico) {
        this.correo_eletronico = correo_eletronico;
    }

    public void setContrazeña(String contrazeña) {
        this.contrazena = contrazeña;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setTipo_usuario(Tipo_de_usurio tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
}
