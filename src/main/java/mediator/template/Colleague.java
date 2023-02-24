package mediator.template;

public abstract class Colleague {
    protected IMediator mediator;

    public Colleague (IMediator mediator){
        this.mediator=mediator;
    }

    public abstract void send(String msg);
    public abstract void messageReceived(String msg);

}
