package com.alejandro.eps.dominio;

import java.util.List;

public class Paciente {
    private String nombre;
    private long cedula;
    private List<Enfermedad> enfermedades;

    public Paciente(String nombre, long cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public List<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(List<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }
}
