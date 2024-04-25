package com.alejandro.herencia.dominio;

public class Taxi extends Carro {
    private String empresa;
    private int nroPasajeros;

    public Taxi(String marca, String modelo, String empresa) {
        super(marca, modelo, "Amarillo");
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "nroPasajeros=" + nroPasajeros +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", empresa='" + empresa + '\'' +
                '}';
    }

    public void subirPasajero() {
        this.nroPasajeros++;
    }

    public void bajarPasajero() {
        this.nroPasajeros--;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getNroPasajeros() {
        return nroPasajeros;
    }
}
