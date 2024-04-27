package com.alejandro.herencia.app;

import com.alejandro.herencia.dominio.BiciRuta;
import com.alejandro.herencia.dominio.Bicicleta;
import com.alejandro.herencia.dominio.Carro;
import com.alejandro.herencia.dominio.Taxi;
import com.alejandro.herencia.dominio.Vehiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AppVehiculos {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        Vehiculo vehiculo = new Carro("Tesla", "Cybertruck");
        Vehiculo cc = new Carro("Toyota", "Corolla");
        Taxi taxi = new Taxi("Hyundai", "Accent", "Copebombas");
        BiciRuta biciRuta = new BiciRuta("Dogma", "Pinarello");
        Vehiculo bici = new Bicicleta("Trek", "Marlin 7");

        vehiculos.add(vehiculo);
        vehiculos.add(cc);
        vehiculos.add(taxi);
        vehiculos.add(biciRuta);
        vehiculos.add(bici);

        acelerarVehiculos(vehiculos);
    }

    private static void acelerarVehiculos(List<Vehiculo> vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
//            if (vehiculo instanceof Carro) {
//                System.out.println("Soy un carro");
//            } else if (vehiculo instanceof Bicicleta) {
//                System.out.println("Soy una bicicleta");
//            }

            vehiculo.acelerar(new Random().nextInt(100));
            System.out.println(vehiculo.toString() + " va a " + vehiculo.getVelocidad() + " km/h");
        }
    }
}
