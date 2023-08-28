package Computadoras;

public class Computadora {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private String tipo;
    private DiscoRigido discoRigido;
    private Procesador procesador;
    private Memoria memoria;

    public Computadora(String marca, String modelo, int anioFabricacion, String tipo, DiscoRigido discoRigido, Procesador procesador, Memoria memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.tipo = tipo;
        this.discoRigido = discoRigido;
        this.procesador = procesador;
        this.memoria = memoria;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public String getTipo() {
        return tipo;
    }

    public DiscoRigido getDiscoRigido() {
        return discoRigido;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDiscoRigido(DiscoRigido discoRigido) {
        this.discoRigido = discoRigido;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public void encender() {
        System.out.println("Encendido");
        discoRigido.iniciar();
        procesador.iniciar();
        memoria.iniciar();
    }

    public void apagar() {
        System.out.println("Apagado");
        discoRigido.apagar();
        procesador.apagar();
        memoria.apagar();
    }
     public void actualizar() {
         System.out.println("Actualizado");
     }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anioFabricacion=" + anioFabricacion +
                ", tipo='" + tipo + '\'' +
                ", discoRigido=" + discoRigido +
                ", procesador=" + procesador +
                ", memoria=" + memoria +
                '}';
    }
}
