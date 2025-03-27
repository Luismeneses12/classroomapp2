b
        package com.example.classRoomApi.modelo;
import java.time.LocalDate;
import ayudas.estado;
public class Asistencia {
    private Integer ID_asistencia;
    private LocalDate fecha;
    private estado  estado;

    public Asistencia(Integer ID_asistencia, LocalDate fecha, estado estado) {
        this.ID_asistencia = ID_asistencia;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Integer getID_asistencia() {
        return ID_asistencia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public estado getEstado() {
        return estado;
    }

    public void setID_asistencia(Integer ID_asistencia) {
        this.ID_asistencia = ID_asistencia;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setEstado(estado estado) {
        this.estado = estado;
    }
}
