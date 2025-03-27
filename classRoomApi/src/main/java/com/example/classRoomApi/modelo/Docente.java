package com.example.classRoomApi.modelo;

import ayudas.Tipo_de_usurio;

public class Docente  {
    private  Integer ID_docente;
    private String especialiadad;

    public Docente(Integer ID_docente, String especialiadad) {
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
