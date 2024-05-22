package com.alejandro.ventanas.dominio;

public class Ventana {

    public void mostrarMensaje(String mensaje) {
        Mensaje msj = null;
        String os = System.getProperty("os.name");

        System.out.println(os);

        if (os.toLowerCase().contains("mac")) {
            msj = new MensajeMac();
        } else if (os.toLowerCase().contains("win")) {
            msj = new MensajeWindows();
        } else if (os.toLowerCase().contains("nix")) {
            msj = new MensajeConsola();
        } else {
            throw new UnsupportedOsException(os);
        }

        msj.mostrar(mensaje);
    }
}
