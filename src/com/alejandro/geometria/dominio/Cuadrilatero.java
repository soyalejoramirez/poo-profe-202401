package com.alejandro.geometria.dominio;

public class Cuadrilatero extends FiguraGeometrica {
    private double ladoA;
    private double ladoB;

    public Cuadrilatero(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double calcularArea() {
        return ladoA * ladoB;
    }

    @Override
    public double calcularPerimetro() {
        return (2 * ladoA) + (2 * ladoB);
    }
}
