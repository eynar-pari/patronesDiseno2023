package mediator.example;

import java.util.ArrayList;
import java.util.List;

public class Slack implements ICanalComunication {

    private List<Profesional> profesionalChat = new ArrayList<>();

    public Slack addProfesionalToTheChat(Profesional profesional) {
        profesionalChat.add(profesional);
        return this;
    }

    @Override
    public void send(String message, Persona persona) {
        for (Profesional prof : profesionalChat) {
            if (!persona.getCi().equals(prof.getCi())) {
                if (persona.getCargo().equals("QA") && prof.getCargo().equals("QA")) {
                    prof.received(message);
                } else if (persona.getCargo().equals("DEV") && prof.getCargo().equals("DEV")) {
                    prof.received(message);
                } else if (persona.getCargo().equals("SM")) {
                    prof.received(message);
                }
            }
        }
    }
}
