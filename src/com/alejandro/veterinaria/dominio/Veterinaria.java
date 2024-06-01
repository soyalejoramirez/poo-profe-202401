package com.alejandro.veterinaria.dominio;

import com.alejandro.veterinaria.excepcion.MascotaNoEncontradaException;
import com.alejandro.veterinaria.excepcion.MascotaNoOperableException;
import com.alejandro.veterinaria.excepcion.MascotaOperadaException;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    private String nombre;
    private List<Mascota> pacientes;

    public Veterinaria() {
        this.pacientes = new ArrayList<>();
    }

    public Mascota revisarMascota(String nombre, GeneroMascota sexo, int edad) {
        Mascota mascota;

        if ((sexo.equals(GeneroMascota.MACHO) && edad >= 12) ||
                sexo.equals(GeneroMascota.HEMBRA) && edad >= 18) {
            mascota = new MascotaApta(nombre, edad, sexo);
        } else {
            mascota = new MascotaNoApta(nombre, edad, sexo);
        }

        this.pacientes.add(mascota);
        return mascota;
    }

    public List<MascotaApta> getPacientesAOperar() {
        return this.pacientes.stream()
                .filter(mascota -> !mascota.esterilizado && mascota instanceof MascotaApta)
                .map(MascotaApta.class::cast)
                .toList();
    }

    public void operar() {
        this.getPacientesAOperar().forEach(MascotaApta::operar);
    }

    public void operar(String nombre) {
        Mascota mascotaAOperar = buscar(nombre);

        if (mascotaAOperar instanceof Operable && !mascotaAOperar.esterilizado) {
            ((MascotaApta) mascotaAOperar).operar();
        } else if (mascotaAOperar.esterilizado) {
            throw new MascotaOperadaException(nombre);
        } else {
            throw new MascotaNoOperableException(nombre);
        }
    }

    public Mascota buscar(String nombre) {
        return this.pacientes.stream()
                .filter(mascota -> mascota.nombre.equalsIgnoreCase(nombre))
                .findFirst()
                .orElseThrow(() -> new MascotaNoEncontradaException(nombre));
    }
}
