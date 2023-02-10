package factoryMethod.template;

public class Client {
    public static void main (String[]ars){
        IProduct prod1 = new ConcreateCreatorProducto1().factoryMethod();
        prod1.create();
    }
}
