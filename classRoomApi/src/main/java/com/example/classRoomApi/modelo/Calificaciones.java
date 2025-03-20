package com.example.classRoomApi.modelo;
 import ayudas.Tipo_de_usurio;

 import java.time.LocalDate;
public class Calificaciones  extends Materias{
    private  Integer ID_calificacion;
    private Float notas;
    private  LocalDate fecha_evaluacion;

    public Calificaciones(Integer id_usurairo, String nombre, String correo_eletronico, String contrazena, String telefono, Tipo_de_usurio tipo_usuario, Integer ID_docente, String especialiadad, String nombre1, Integer ID_curso, Integer ID_materia, String nombre2, Integer ID_calificacion, Float notas, LocalDate fecha_evaluacion) {
        super(id_usurairo, nombre, correo_eletronico, contrazena, telefono, tipo_usuario, ID_docente, especialiadad, nombre1, ID_curso, ID_materia, nombre2);
        this.ID_calificacion = ID_calificacion;
        this.notas = notas;
        this.fecha_evaluacion = fecha_evaluacion;
    }

    public Calificaciones(Integer ID_docente, String especialiadad, String Nombre, Integer ID_curso, Integer ID_materia, String nombre, Integer ID_calificacion, Float notas, LocalDate fecha_evaluacion) {
        super(ID_docente, especialiadad, Nombre, ID_curso, ID_materia, nombre);
        this.ID_calificacion = ID_calificacion;
        this.notas = notas;
        this.fecha_evaluacion = fecha_evaluacion;
    }

    public Integer getID_calificacion() {
        return ID_calificacion;
    }

    public Float getNotas() {
        return notas;
    }

    public LocalDate getFecha_evaluacion() {
        return fecha_evaluacion;
    }

    public void setID_calificacion(Integer ID_calificacion) {
        this.ID_calificacion = ID_calificacion;
    }

    public void setNotas(Float notas) {
        this.notas = notas;
    }

    public void setFecha_evaluacion(LocalDate fecha_evaluacion) {
        this.fecha_evaluacion = fecha_evaluacion;
    }
}
