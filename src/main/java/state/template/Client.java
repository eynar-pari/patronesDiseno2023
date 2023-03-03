package state.template;

public class Client {

    public static void main (String[]args){

        Context context = new Context("jose","123","estudiante");

        context.setState(new ConcreteState1());
        context.request();

        context.setState(new ConcreteState2());
        context.request();

        context.setState(new ConcreteState3());
        context.request();




    }


}
