package factoryMethod.example;

public class Base {

    private String tipo;
    private String nombre;
    private String costo;
    private String tamano;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void showInfo(){
        System.out.println("Base > tipo:"+ tipo);
        System.out.println("Base > tamano:"+tamano);
        System.out.println("Base > costo:"+costo);
        System.out.println("Base > nombre:"+nombre);

    }
}

