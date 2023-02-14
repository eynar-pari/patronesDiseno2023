package abstractFactory.template;

public class ConcreteProductA implements IProduct{
    @Override
    public void methodA() {
        System.out.println("ConcreteProductA - methodA");
    }

    @Override
    public void methodB() {
        System.out.println("ConcreteProductA - methodB");
    }

    @Override
    public void methodC() {
        System.out.println("ConcreteProductA - methodC");
    }
}
