package com.alejandro.facturacion.dominio;

import java.time.LocalDate;

public abstract class Factura {
    protected long valor;
    protected String cliente;
    protected LocalDate fecha;

    protected Factura(long valor, String cliente, LocalDate fecha) {
        this.valor = valor;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    protected abstract long calcularTotal();
}
