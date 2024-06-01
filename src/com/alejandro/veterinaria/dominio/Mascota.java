package com.alejandro.veterinaria.dominio;

public abstract class Mascota {
    protected String nombre;
    protected GeneroMascota sexo;
    protected int edad;
    protected boolean esterilizado;

    public Mascota(String nombre, int edad, GeneroMascota sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }
}
