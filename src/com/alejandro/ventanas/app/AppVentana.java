package com.alejandro.ventanas.app;

import com.alejandro.ventanas.dominio.UnsupportedOsException;
import com.alejandro.ventanas.dominio.Ventana;

public class AppVentana {
    public static void main(String[] args) {
        Ventana ventana = new Ventana();

        try {
            ventana.mostrarMensaje("Hola mundo! 🐰");
        } catch (UnsupportedOsException ex) {
            System.out.println("ERROR-> " + ex.getMessage());
        } finally {
            System.out.println("Pasó el huracán...");
        }
    }
}
