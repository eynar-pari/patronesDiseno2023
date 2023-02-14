package abstractFactory.template;

public class Client {
    public static void main(String[] argss) {
        String dato = "ProductD";

        AbstractFactory.make(dato).methodA();
        AbstractFactory.make(dato).methodB();
        AbstractFactory.make(dato).methodC();

    }

}
