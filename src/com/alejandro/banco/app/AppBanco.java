package com.alejandro.banco.app;

import com.alejandro.banco.dominio.Banco;
import com.alejandro.banco.dominio.CuentaBancaria;
import com.alejandro.banco.dominio.Persona;

public class AppBanco {
    public static void main(String[] args) {
        Banco bancolombia = new Banco("Bancolombia");
        Persona alex = new Persona("Alexander");
        CuentaBancaria miCuenta = new CuentaBancaria("12345-454", alex, bancolombia);

        CuentaBancaria vanessaCuenta = new CuentaBancaria("12345", new Persona("Vanessa Dominguez"), bancolombia);

        System.out.println("Numero de la cuenta: " + miCuenta.getPropietario().getNombre());
        System.out.println("Numero de la cuenta Vanessa: " + vanessaCuenta.getPropietario().getNombre());

        miCuenta.consignar(1000000);
        miCuenta.retirar(950000);
        miCuenta.transferir(400000, vanessaCuenta);
        miCuenta.mostrarSaldo();

        vanessaCuenta.consignar(10000);

        System.out.println("Vanessa");
        vanessaCuenta.mostrarSaldo();
    }
}
