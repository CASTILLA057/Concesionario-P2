package Vehiculo;

public class Camion extends Vehiculo {
    protected double capacidadDeCarga;

    public Camion(double capacidadDeCarga, String marca, String modelo, int año) {
        this.capacidadDeCarga = capacidadDeCarga;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Camión - Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año + ", Capacidad de carga: " + capacidadDeCarga + " Toneladas");
    }

}
