package factoryMethod.example;

public class HeladoMixto implements IHelado{

    private String tamano;
    private String forma;

    private String costo;
    private Fruta fruta = new Fruta();
    private Base base = new Base();

    private Crema crema= new Crema();

    public HeladoMixto(){}

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public Crema getCrema() {
        return crema;
    }

    public void setCrema(Crema crema) {
        this.crema = crema;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    @Override
    public void preparHelado() {
        System.out.println("preparando helado de crema");
    }

    @Override
    public void showHelado() {
        System.out.println(" ** Helado Mixto **");
        System.out.println("tamano:"+tamano);
        System.out.println("forma:"+forma);
        System.out.println("costo:"+costo);
        fruta.showInfo();
        base.showInfo();
        crema.showInfo();
    }
}
