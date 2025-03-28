package Vehiculo;

public class Moto extends Vehiculo {
    protected double cilindrada;

    public Moto(double cilindrada, String marca, String modelo, int año) {
        this.cilindrada = cilindrada;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Moto - Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año + ", Cilindrada: " + cilindrada + "cc");
    }
}
