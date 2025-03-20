package com.example.classRoomApi.modelo;

import ayudas.Tipo_de_usurio;

public class Materias  extends curso {
     private  Integer ID_materia;
     private  String Nombre;



    public Materias(Integer id_usurairo, String nombre, String correo_eletronico, String contrazena, String telefono, Tipo_de_usurio tipo_usuario, Integer ID_docente, String especialiadad, String nombre1, Integer ID_curso, Integer ID_materia, String nombre2) {
        super(id_usurairo, nombre, correo_eletronico, contrazena, telefono, tipo_usuario, ID_docente, especialiadad, nombre1, ID_curso);
        this.ID_materia = ID_materia;
        Nombre = nombre2;
    }

    public Materias(Integer ID_docente, String especialiadad, String Nombre, Integer ID_curso, Integer ID_materia, String nombre) {
        super(ID_docente, especialiadad, Nombre, ID_curso);
        this.ID_materia = ID_materia;
        this.Nombre = nombre;
    }

    public Integer getID_materia() {
        return ID_materia;
    }

    @Override
    public String getNombre() {
        return Nombre;
    }
}
