package command.template;

public class ConcreteCommand3 implements ICommand{

    private Receiver receiver;

    public ConcreteCommand3(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // agregar logica
        this.receiver.action3();
        // agregar logica
    }
}
