package factoryMethod.example;

public class HeladoAguaCreator extends CreatorHelado {
    @Override
    public HeladoAgua create() {
        HeladoAgua helado = new HeladoAgua();
        Base plastico = new Base();
        plastico.setCosto("5bs");
        plastico.setTamano("Mediano");
        plastico.setNombre("h1");
        plastico.setTipo("plastico");

        helado.setBase(plastico);
        Fruta fruta = new Fruta();
        fruta.setCosto("2bs");
        fruta.setNombre("limon");
        fruta.setTipoFruta("citrico");
        fruta.setTamano("mediano");

        helado.setFruta(fruta);
        helado.setTamano("mediano");
        helado.setForma("circular");

        return helado;
    }


}
