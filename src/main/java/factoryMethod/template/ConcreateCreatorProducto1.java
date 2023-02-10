package factoryMethod.template;

public class ConcreateCreatorProducto1 extends Creator {
    @Override
    public ConcreteProduct1 factoryMethod() {
        ConcreteProduct1 p1 = new ConcreteProduct1();
        /*
         *
         * toda la logica de creacion del concrete product1
         *
         * */
        return p1;
    }
}
