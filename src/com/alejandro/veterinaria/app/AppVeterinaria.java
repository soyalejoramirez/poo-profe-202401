package com.alejandro.veterinaria.app;

import com.alejandro.veterinaria.dominio.GeneroMascota;
import com.alejandro.veterinaria.dominio.Veterinaria;

public class AppVeterinaria {
    public static void main(String[] args) {
        Veterinaria veterinaria = new Veterinaria();

        veterinaria.revisarMascota("Kepler", GeneroMascota.MACHO, 11);
        veterinaria.revisarMascota("Ada", GeneroMascota.HEMBRA, 18);
        veterinaria.revisarMascota("Galileo", GeneroMascota.MACHO, 13);

        System.out.println("Pacientes a operar: ");
        veterinaria.getPacientesAOperar().forEach(mascota -> System.out.println(mascota.getNombre()));
        veterinaria.operar();

        System.out.println("Pacientes a operar 2: ");
        veterinaria.getPacientesAOperar().forEach(mascota -> System.out.println(mascota.getNombre()));
    }
}
