package com.alejandro.veterinaria.excepcion;

public class MascotaNoOperableException extends RuntimeException {
    public MascotaNoOperableException(String nombre) {
        super("La mascota " + nombre + " no puede ser operada.");
    }
}
