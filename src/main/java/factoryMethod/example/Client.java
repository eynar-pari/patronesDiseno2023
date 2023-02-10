package factoryMethod.example;

public class Client {
    public static void main(String [] args){

        HeladoAgua h1 = new HeladoAguaCreator().create();
        HeladoAgua h2 = new HeladoAguaCreator().create();
        HeladoAgua h3 = new HeladoAguaCreator().create();

        HeladoCrema c1 = new HeladoCremaCreator().create();
        HeladoCrema c2 = new HeladoCremaCreator().create();
        HeladoCrema c3 = new HeladoCremaCreator().create();

        HeladoMixto m1 = new HeladoMixtoCreator().create();
        HeladoMixto m2 = new HeladoMixtoCreator().create();
        HeladoMixto m3 = new HeladoMixtoCreator().create();

        h1.showHelado();
        h2.showHelado();
        h3.showHelado();
        c1.showHelado();
        c2.showHelado();
        c3.showHelado();
        m1.showHelado();
        m2.showHelado();
        m3.showHelado();


    }


}
