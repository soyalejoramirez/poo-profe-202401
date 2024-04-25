package com.alejandro.herencia.dominio;

public class Carro extends Vehiculo {
    private String placa;

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    public Carro(String marca, String modelo, String color) {
        super(marca, modelo, color);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
