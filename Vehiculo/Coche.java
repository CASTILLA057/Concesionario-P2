package Vehiculo;

public class Coche extends Vehiculo {
    protected int numPuertas;

    public Coche(int numPuertas, String marca, String modelo, int año) {
        this.numPuertas = numPuertas;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Coche - Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año + ", Puertas: " + numPuertas);
    }
}
