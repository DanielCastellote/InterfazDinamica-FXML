package com.example.interfazdinamicafxml;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Persona {

    private String nombre;
    private String correo;
    private String curso;

    public Persona(String nombre, String correo, String curso) {
        this.nombre = nombre;
        this.correo = correo;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
