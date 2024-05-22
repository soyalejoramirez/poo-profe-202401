package com.alejandro.ventanas.dominio;

public class MensajeConsola implements Mensaje {

    @Override
    public void mostrar(String mensaje) {
        System.out.println(mensaje);
    }
}
