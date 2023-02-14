package abstractFactory.template;

public class AbstractFactory {


    public static IProduct make(String objectType){
        IProduct product;
        switch (objectType.toLowerCase()){
            case "producta":
                product = new ConcreteProductA();
                break;
            case "productb":
                product = new ConcreteProductB();
                break;
            case "productc":
                product = new ConcreteProductC();
                break;
            case "productd":
                product = new ConcreteProductD();
                break;
            default:
                product = new ConcreteProductA();
                break;
        }
        return product;
    }

}
