package factoryMethod.example;

public class Fruta {
    private String tipoFruta;
    private String nombre;
    private String costo;
    private String tamano;

    public String getTipoFruta() {
        return tipoFruta;
    }

    public void setTipoFruta(String tipoFruta) {
        this.tipoFruta = tipoFruta;
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
        System.out.println("Fruta > tipoFruta:"+tipoFruta);
        System.out.println("Fruta > tamano:"+tamano);
        System.out.println("Fruta > costo:"+costo);
        System.out.println("Fruta > nombre:"+nombre);

    }
}

