package command.template;

public class Client {
    public static void main (String []args){
        Receiver receiver = new Receiver();

        ConcreteCommand1 atacar = new ConcreteCommand1(receiver);
        ConcreteCommand2 curar = new ConcreteCommand2(receiver);
        ConcreteCommand3 tanquear = new ConcreteCommand3(receiver);

        Invoker finalAttack = new Invoker();
        finalAttack.addCommand(atacar)
                .addCommand(curar)
                .addCommand(curar)
                .addCommand(tanquear)
                .addCommand(curar);

        finalAttack.run();

        finalAttack.run();

    }
}
