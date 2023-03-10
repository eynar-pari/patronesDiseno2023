package adapter.template;

public class Client {

    public static void main(String[]args){

        ConcreteObject3 mesa = new ConcreteObject3();
        mesa.method1();
        mesa.method2();

        Adaptee mesaSmarth = new Adaptee();

        ConcreteAdapter mesaSmarth1 = new ConcreteAdapter(mesaSmarth);

        mesaSmarth1.method1();
        mesaSmarth1.method2();

    }
}
