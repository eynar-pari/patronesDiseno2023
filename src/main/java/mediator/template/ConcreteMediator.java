package mediator.template;

public class ConcreteMediator implements IMediator{

    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleagueA)
            colleagueB.messageReceived(message);
        else
            colleagueA.messageReceived(message);
    }
}
