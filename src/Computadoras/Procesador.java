package Computadoras;

public class Procesador {
    private String marca;
    private String modelo;
    private  Double capacidadEnGigahertz;

    public Procesador(String marca, String modelo, Double capacidadEnGigahertz) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadEnGigahertz = capacidadEnGigahertz;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getCapacidadEnGigahertz() {
        return capacidadEnGigahertz;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidadEnGigahertz(Double capacidadEnGigahertz) {
        this.capacidadEnGigahertz = capacidadEnGigahertz;
    }

    public void iniciar() {
        System.out.println("Procesador inicializado");
    }

    public void apagar() {
        System.out.println("El procesador fue apagado.");
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadEnGigahertz=" + capacidadEnGigahertz +
                '}';
    }
}
