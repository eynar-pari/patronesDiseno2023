package decorator.template;

public class Client {
    public static void main (String []args){
        Component analisisDatos = new ConcreteComponent();

        analisisDatos = new ConcreteDecorator1(analisisDatos);
        analisisDatos = new ConcreteDecorator2(analisisDatos);

        analisisDatos.operation();





    }

}
