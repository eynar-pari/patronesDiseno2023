package decorator.template;

public class ConcreteDecorator2 extends Decorator{

    private String attribute1;
    private String attribute2;

    public ConcreteDecorator2(Component component) {
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
        System.out.println(" ConcreteDecorator2>>> DECORANDO  <<<<");
        System.out.println(" ConcreteDecorator2>>> Agregando nueva algoritmo  <<<<");
        System.out.println(" ConcreteDecorator2>>> Guardando a base datos <<<<");
        System.out.println(" ConcreteDecorator2>>> verificando seguridad de codigo <<<<");
    }
}
