package iterator.practice;

public class Automovil {
    private String id;
    private String costo;
    private String modelo;
    private String numAsientos;
    private String tipo;

    public String getId() {
        return id;
    }

    public String getCosto() {
        return costo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNumAsientos() {
        return numAsientos;
    }

    public String getTipo() {
        return tipo;
    }

    public Automovil setId(String id) {
        this.id = id;
        return this;
    }

    public Automovil setCosto(String costo) {
        this.costo = costo;
        return this;
    }

    public Automovil setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public Automovil setNumAsientos(String numAsientos) {
        this.numAsientos = numAsientos;
        return this;
    }

    public Automovil setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public void showInfo(){
        System.out.println("id:"+id);
        System.out.println("costo:"+costo);
        System.out.println("modelo:"+modelo);
        System.out.println("numAsientos:"+numAsientos);
        System.out.println("tipo:"+tipo);

    }
}
