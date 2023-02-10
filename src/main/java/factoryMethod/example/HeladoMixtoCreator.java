package factoryMethod.example;

public class HeladoMixtoCreator extends CreatorHelado {
    @Override
    public HeladoMixto create() {
        HeladoMixto helado = new HeladoMixto();
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
        Crema crema = new Crema();
        crema.setCosto("3bs");
        crema.setMarca("patito");
        crema.setSabor("limon");

        helado.setCrema(crema);
        helado.setTamano("mediano");
        helado.setForma("circular");
        helado.setCosto("50bs");
        return helado;
    }
}
