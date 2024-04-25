package com.alejandro.geometria.app;

import com.alejandro.geometria.dominio.Circulo;
import com.alejandro.geometria.dominio.Cuadrado;
import com.alejandro.geometria.dominio.Cuadrilatero;
import com.alejandro.geometria.dominio.FiguraGeometrica;

public class AppGeo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);
        Cuadrado cuadrado = new Cuadrado(40);

        calcularValores(cuadrado);
    }

    public static void calcularValores(FiguraGeometrica figura) {
        System.out.println(figura.calcularArea());
        System.out.println(figura.calcularPerimetro());
    }
}
