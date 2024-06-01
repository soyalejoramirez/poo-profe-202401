package com.alejandro.veterinaria.excepcion;

public class MascotaNoEncontradaException extends RuntimeException {
    public MascotaNoEncontradaException(String nombre) {
        super("La mascota " + nombre + " no existe en la veterinaria.");
    }
}
