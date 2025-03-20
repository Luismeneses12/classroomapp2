package com.example.classRoomApi.modelo;
import java.time.LocalDate;
public class Inscripcion   {
    private Integer ID_inscripcion;
    private LocalDate fecha_inscripcion;

    public Inscripcion() {
    }

    public Inscripcion(Integer ID_inscripcion, LocalDate fecha_inscripcion) {
        this.ID_inscripcion = ID_inscripcion;
        this.fecha_inscripcion = fecha_inscripcion;
    }

    public Integer getID_inscripcion() {
        return ID_inscripcion;
    }

    public LocalDate getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public void setID_inscripcion(Integer ID_inscripcion) {
        this.ID_inscripcion = ID_inscripcion;
    }

    public void setFecha_inscripcion(LocalDate fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }
}
