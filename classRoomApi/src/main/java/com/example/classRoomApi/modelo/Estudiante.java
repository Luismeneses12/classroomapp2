package com.example.classRoomApi.modelo;
import ayudas.Tipo_de_usurio;

import java.time.LocalDate;
public class Estudiante  extends usuario{
  private  Integer ID_Estudiante;
  private  Integer grado;
  private   LocalDate fecha;
  private  String direccion;

    public Estudiante() {
    }

    public Estudiante(Integer id_usurairo, String nombre, String correo_eletronico, String contrazeña, String telefono, Tipo_de_usurio tipo_usuario) {
        super(id_usurairo, nombre, correo_eletronico, contrazeña, telefono, tipo_usuario);
    }

    public Estudiante(Integer id_usurairo, String nombre, String correo_eletronico, String contrazeña, String telefono, Tipo_de_usurio tipo_usuario, Integer ID_Estudiante) {
        super(id_usurairo, nombre, correo_eletronico, contrazeña, telefono, tipo_usuario);
        this.ID_Estudiante = ID_Estudiante;
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
