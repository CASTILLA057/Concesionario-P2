package Concesionario;

import java.util.ArrayList;
import Vehiculo.Vehiculo;

public class Concesionario {

    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void listarVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("--------------------------------------------");
            vehiculo.mostrarInfo();
            System.out.println("--------------------------------------------");
        }
    }
}
