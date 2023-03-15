package bridge.template;

public class Client {

    public static void main(String []args){

        Abstraction1 obj1 = new Abstraction1(new ImplementorA());
        obj1.operation1();

        Abstraction2 ob2 = new Abstraction2(new ImplementorB());
        ob2.operation1();

        ob2 = new Abstraction2(new ImplementorC());
        ob2.operation1();



    }

}
