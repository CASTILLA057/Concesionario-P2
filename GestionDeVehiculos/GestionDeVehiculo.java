package GestionDeVehiculos;

import Concesionario.Concesionario;
import Vehiculo.Camion;
import Vehiculo.Coche;
import Vehiculo.Moto;

public class GestionDeVehiculo {
    public static void main(String[] args) {

        Concesionario concesionario = new Concesionario();
        concesionario.agregarVehiculo(new Coche(4, "Chevrolet", "H", 2020));
        concesionario.agregarVehiculo(new Moto(1000, "Yamaha", "H2R", 2025));
        concesionario.agregarVehiculo(new Camion(10, "Susuki", "M", 2015));

        System.out.println("Lista de vehiculos en el concesionario: ");
        concesionario.listarVehiculos();
    }

}
