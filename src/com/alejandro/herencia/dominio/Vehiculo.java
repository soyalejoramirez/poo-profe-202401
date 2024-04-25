package com.alejandro.herencia.dominio;

public class Vehiculo {
    protected String serial;
    protected String marca;
    protected String modelo;
    protected String color;
    protected double velocidad;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public void acelerar(double incremento) {
        System.out.println("Acelerando vehiculo...");

        if (incremento > 0) {
            this.velocidad += incremento;
        }
    }

    public void frenar(double decremento) {
        System.out.println("Frenando vehiculo...");

        if (decremento > 0) {
            this.velocidad -= decremento;
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "serial='" + serial + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }

    public double getVelocidad() {
        return velocidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getSerial() {
        return serial;
    }
}
