package com.example.classRoomApi.modelo;
@E
import ayudas.Tipo_de_usurio;

import java.time.LocalDate;
public class Estudiante {
  private  Integer ID_Estudiante;
  private  Integer grado;
  private   LocalDate fecha;
  private  String direccion;

    public Estudiante() {
    }

    public Estudiante(Integer grado, Integer ID_Estudiante, LocalDate fecha, String direccion) {
        this.grado = grado;
        this.ID_Estudiante = ID_Estudiante;
        this.fecha = fecha;
        this.direccion = direccion;
    }

    public Integer getID_Estudiante() {
        return ID_Estudiante;
    }

    public Integer getGrado() {
        return grado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setGrado(Integer grado) {
        this.grado = grado;
    }

    public void setID_Estudiante(Integer ID_Estudiante) {
        this.ID_Estudiante = ID_Estudiante;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
