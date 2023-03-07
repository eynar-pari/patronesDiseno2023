package visitor.tempalte;

public class Client {
    public static void main (String[]args){
        ConcreteObject1 casaGatito = new ConcreteObject1();
        ConcreteObject2 granja = new ConcreteObject2();

        ConcreteVisitor veterinario = new ConcreteVisitor();

        casaGatito.accept(veterinario);
        granja.accept(veterinario);




    }
}
