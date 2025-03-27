package com.example.classRoomApi.modelo;

@Entity


import ayudas.Tipo_de_usurio;

public class curso  {
    private  Integer ID_curso;
    private  String  Nombre ;

    public curso(Integer ID_curso, String nombre) {
        this.ID_curso = ID_curso;
        Nombre = nombre;
    }

    public Integer getID_curso() {
        return ID_curso;
    }

    @Override
    public String getNombre() {
        return Nombre;
    }

    public void setID_curso(Integer ID_curso) {
        this.ID_curso = ID_curso;
    }

    @Override
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
}
