package com.example.classRoomApi.modelo;

import ayudas.Tipo_de_usurio;

public class curso  extends Docente {
    private  Integer ID_curso;
    private  String  Nombre ;

    public curso(Integer ID_docente, String especialiadad, String Nombre, Integer ID_curso) {
        super(ID_docente, especialiadad);
        this.Nombre = Nombre;
        this.ID_curso = ID_curso;
    }

    public curso(Integer id_usurairo, String nombre, String correo_eletronico, String contrazena, String telefono, Tipo_de_usurio tipo_usuario, Integer ID_docente, String especialiadad, String nombre1, Integer ID_curso) {
        super(id_usurairo, nombre, correo_eletronico, contrazena, telefono, tipo_usuario, ID_docente, especialiadad);
        this.Nombre = nombre1;
        this.ID_curso = ID_curso;
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
