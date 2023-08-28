package Computadoras;

public class DiscoRigido {
    private String marca;
    private Double capacidadEnGB;
    private Double velocidad;

    public DiscoRigido(String marca, Double capacidad, Double velocidad) {
        this.marca = marca;
        this.capacidadEnGB = capacidad;
        this.velocidad = velocidad;
    }
    public String getMarca() {
        return marca;
    }

    public Double getCapacidad() {
        return capacidadEnGB;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCapacidad(Double capacidad) {
        this.capacidadEnGB = capacidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public void iniciar() {
        System.out.println("Disco rigido inicializado");
    }

    public void apagar() {
        System.out.println("El Disco rigido fue apagado.");
    }

    @Override
    public String toString() {
        return "DiscoRigido{" +
                "marca='" + marca + '\'' +
                ", capacidad=" + capacidadEnGB +
                ", velocidad=" + velocidad +
                '}';
    }
}
