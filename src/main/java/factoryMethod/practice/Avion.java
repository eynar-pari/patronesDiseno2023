package factoryMethod.practice;

public class Avion {
//(marca,capacidad, modelo, numerodeAsientos)
    private String marca;
    private String capacidad;
    private String modelo;
    private int numAsientos;

    public Avion() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public void printInfo(){
        System.out.println("Avion> marca: "+marca);
        System.out.println("Avion> capacidad:"+capacidad);
        System.out.println("Avion> modelo:"+modelo);
        System.out.println("Avion> numAsientos:"+numAsientos);

    }
}
