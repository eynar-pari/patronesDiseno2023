package abstractFactory.template;

public class ConcreteProductC implements IProduct{
    @Override
    public void methodA() {
        System.out.println("ConcreteProductC - methodA");
    }

    @Override
    public void methodB() {
        System.out.println("ConcreteProductC - methodB");
    }

    @Override
    public void methodC() {
        System.out.println("ConcreteProductC - methodC");
    }
}
