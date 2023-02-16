package iterator.template;

public class Client {
    public static void main (String[]args){
        ConcreteAggregateA bancoBisa = new ConcreteAggregateA();
        bancoBisa.addName("jose1");
        bancoBisa.addName("jose2");
        bancoBisa.addName("jose3");
        bancoBisa.addName("jose4");
        bancoBisa.addName("jose5");

        ConcreteAggregateB bancoUnion = new ConcreteAggregateB();
        bancoUnion.addName("juan1");
        bancoUnion.addName("juan2");
        bancoUnion.addName("juan3");
        bancoUnion.addName("juan4");
        bancoUnion.addName("juan5");

        Iterator iterator;
        iterator=bancoBisa.createIterator();

        while (iterator.hasNext()){
            String clientName = (String) iterator.next();
            System.out.println("bancoBisa> account:"+clientName);
        }

        iterator=bancoUnion.createIterator();

        while (iterator.hasNext()){
            String clientName = (String) iterator.next();
            System.out.println("bancoUnion> account:"+clientName);
        }

    }


}
