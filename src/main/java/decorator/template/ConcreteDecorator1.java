package decorator.template;

public class ConcreteDecorator1 extends Decorator{

    private String attribute1;
    private String attribute2;

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }


    public void operation() {
        super.operation();
        System.out.println(" >ConcreteDecorator1>> DECORANDO  <<<<");
        System.out.println(" >ConcreteDecorator1>> Agregando nueva funcionalidad  <<<<");
    }
}
