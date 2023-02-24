package mediator.template;

public class Client {

    public static void main (String []args){

        ConcreteMediator whatsapp = new ConcreteMediator();
        ConcreteColleagueA eynar = new ConcreteColleagueA(whatsapp);
        ConcreteColleagueB alexis = new ConcreteColleagueB(whatsapp);

        whatsapp.setColleagueA(eynar);
        whatsapp.setColleagueB(alexis);

        eynar.send(" Eynar > enviando mensaje a Alexis ...");
        alexis.send(" Alexis respondiendo mensaje");

    }
}
