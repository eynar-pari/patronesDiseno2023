package abstractFactory.template;

public class ConcreteProductD implements IProduct{
    @Override
    public void methodA() {
        System.out.println("ConcreteProductD - methodA");
    }

    @Override
    public void methodB() {
        System.out.println("ConcreteProductD - methodB");
    }

    @Override
    public void methodC() {
        System.out.println("ConcreteProductD - methodC");
    }
}
