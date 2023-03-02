package command.practice;

public class CorrerCmd implements IAction{
    private Personaje personaje;

    public CorrerCmd(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void execute() {
        System.out.println("commando generado >>");
        personaje.correr();
    }
}
