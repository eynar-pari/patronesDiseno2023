package builder.template;

public class ConcreteBuilder2 extends Builder{
    @Override
    public void buildAttribute1() {
        product.setAttribute1("ConcreteBuilder2> valor 1");
    }

    @Override
    public void buildAttribute2() {
        product.setAttribute2("ConcreteBuilder2> valor 2");
    }

    @Override
    public void buildAttribute3() {
        product.setAttribute3("ConcreteBuilder2> valor 3");
    }

    @Override
    public void buildAttribute4() {
        product.setAttribute4("ConcreteBuilder2> valor 4");
    }
}
