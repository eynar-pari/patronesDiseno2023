package command.template;

public class ConcreteCommand1 implements ICommand{

    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // agregar logica
        this.receiver.action1();
        // agregar logica
    }
}
