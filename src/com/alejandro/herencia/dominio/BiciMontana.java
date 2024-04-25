package com.alejandro.herencia.dominio;

public class BiciMontana extends Bicicleta {
    private String tipoSuspension;

    public BiciMontana(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public String toString() {
        return "🚵🏼";
    }

    public String getTipoSuspension() {
        return tipoSuspension;
    }

    public void setTipoSuspension(String tipoSuspension) {
        this.tipoSuspension = tipoSuspension;
    }
}
