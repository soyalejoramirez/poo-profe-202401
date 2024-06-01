package com.alejandro.veterinaria.excepcion;

public class MascotaOperadaException extends RuntimeException {
    public MascotaOperadaException(String nombre) {
        super("La mascota " + nombre + " ya está operada.");
    }
}
