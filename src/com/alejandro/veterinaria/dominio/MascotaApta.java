package com.alejandro.veterinaria.dominio;

public class MascotaApta extends Mascota implements Operable {
    public MascotaApta(String nombre, int edad, GeneroMascota sexo) {
        super(nombre, edad, sexo);
    }

    @Override
    public void operar() {
        this.esterilizado = true;
    }
}
