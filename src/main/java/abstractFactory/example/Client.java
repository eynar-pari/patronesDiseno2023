package abstractFactory.example;

public class Client {
    public static void main (String []args){
        String ide="pycharm";

        FactoryIdeMap.make(ide).cloning();
        FactoryIdeMap.make(ide).code();
        FactoryIdeMap.make(ide).debug();
        FactoryIdeMap.make(ide).build();
    }

}
