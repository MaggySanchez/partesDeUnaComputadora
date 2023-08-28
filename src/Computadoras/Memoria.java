package Computadoras;

public class Memoria {
    private Double capacidadEnGigabytes;
    private String marca;

    public Memoria(Double capacidadEnGigabytes, String marca) {
        this.capacidadEnGigabytes = capacidadEnGigabytes;
        this.marca = marca;
    }

    public Double getCapacidadEnGigabytes() {
        return capacidadEnGigabytes;
    }

    public String getMarca() {
        return marca;
    }

    public void setCapacidadEnGigabytes(Double capacidadEnGigabytes) {
        this.capacidadEnGigabytes = capacidadEnGigabytes;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void iniciar() {
        System.out.println("La memoria fue inicializada.");
    }

    public void apagar() {
        System.out.println("La memoria fue apagada.");
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidadEnGigabytes=" + capacidadEnGigabytes +
                ", marca='" + marca + '\'' +
                '}';
    }
}
