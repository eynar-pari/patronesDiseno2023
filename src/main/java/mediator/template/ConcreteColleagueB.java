package mediator.template;

public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg) {
        this.mediator.send(msg,this);
    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("Mensaje ColleagueB <<<< "+msg);
    }
}
