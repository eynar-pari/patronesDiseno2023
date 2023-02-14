package builder.template;

public class ConcreteBuilder1 extends Builder{
    @Override
    public void buildAttribute1() {
        product.setAttribute1("ConcreteBuilder1> valor 1");
    }

    @Override
    public void buildAttribute2() {
        product.setAttribute2("ConcreteBuilder1> valor 2");
    }

    @Override
    public void buildAttribute3() {
        product.setAttribute3("ConcreteBuilder1> valor 3");
    }

    @Override
    public void buildAttribute4() {
        product.setAttribute4("ConcreteBuilder1> valor 4");
    }
}
