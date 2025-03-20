package com.example.classRoomApi.modelo;

import ayudas.Tipo_de_usurio;

public class Docente  extends usuario{
    private  Integer ID_docente;
    private String especialiadad;

    public Docente(Integer ID_docente, String especialiadad) {
        this.ID_docente = ID_docente;
        this.especialiadad = especialiadad;
    }

    public Docente(Integer id_usurairo, String nombre, String correo_eletronico, String contrazena, String telefono, Tipo_de_usurio tipo_usuario, Integer ID_docente, String especialiadad) {
        super(id_usurairo, nombre, correo_eletronico, contrazena, telefono, tipo_usuario);
        this.ID_docente = ID_docente;
        this.especialiadad = especialiadad;
    }

    public String getEspecialiadad() {
        return especialiadad;
    }

    public Integer getID_docente() {
        return ID_docente;
    }

    public void setID_docente(Integer ID_docente) {
        this.ID_docente = ID_docente;
    }

    public void setEspecialiadad(String especialiadad) {
        this.especialiadad = especialiadad;
    }
}
