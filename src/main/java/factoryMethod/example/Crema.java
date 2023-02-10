package factoryMethod.example;

public class Crema {
    private String sabor;
    private String marca;
    private String costo;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }



    public void showInfo(){
        System.out.println("Crema > tipo:"+ sabor);
        System.out.println("Crema > costo:"+costo);
        System.out.println("Crema > nombre:"+ marca);

    }
}

