package factoryMethod.template;

public class ConcreteProduct2 implements IProduct{
    @Override
    public void create() {
        System.out.println("Creando ConcreteProduct2");
    }
}
