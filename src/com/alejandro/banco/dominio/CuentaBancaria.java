package com.alejandro.banco.dominio;

public class CuentaBancaria {
    // Atributos
    private String numero;
    private Persona propietario;
    private double saldo;
    private double tasaInteres;
    private String tipo;
    private Banco banco;

    // Constructores
    private CuentaBancaria(String numero) {
        this.numero = numero;
    }

    public CuentaBancaria(String numero, Persona propietario, Banco banco) {
        this.numero = numero;
        this.propietario = propietario;
        this.banco = banco;
    }

    // Métodos
    public void consignar(int valorAConsignar) {
        this.saldo = this.saldo + valorAConsignar;
    }

    public boolean retirar(int valorARetirar) {
        if (valorARetirar <= this.saldo) {
            this.saldo -= valorARetirar;
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public boolean transferir(int valorATrans, CuentaBancaria otraCuenta) {
        boolean retiroCorrectamente = this.retirar(valorATrans);

        if (retiroCorrectamente) {
            otraCuenta.consignar(valorATrans);
            return true;
        } else {
            return false;
        }
    }

    public void mostrarSaldo() {
        System.out.println("El saldo es $" + this.saldo);
    }

    // Getters & Setters

    public String getNumero() {
        return numero;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public String getTipo() {
        return tipo;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
