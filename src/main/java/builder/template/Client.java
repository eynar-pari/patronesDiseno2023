package builder.template;

public class Client {

        public static void main(String[]args){
            Director director = new Director();
            ConcreteBuilder2 concreteBuilder1 = new ConcreteBuilder2();

            director.setBuilder(concreteBuilder1);
            director.buildProduct();

            Product p1 = director.getProduct();
            p1.showInfo();

        }
}
