package abstractFactory.template;

public class ConcreteProductB implements IProduct{
    @Override
    public void methodA() {
        System.out.println("ConcreteProductB - methodA");
    }

    @Override
    public void methodB() {
        System.out.println("ConcreteProductB - methodB");
    }

    @Override
    public void methodC() {
        System.out.println("ConcreteProductB - methodC");
    }
}
