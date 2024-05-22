package com.alejandro.ventanas.dominio;

public class UnsupportedOsException extends RuntimeException {
    UnsupportedOsException(String os) {
        super("El sistema operativo " + os + " no es soportado.");
    }
}
