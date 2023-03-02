package command.practice;

public class ProtegerCmd implements IAction{
    private Personaje personaje;

    public ProtegerCmd(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void execute() {
        System.out.println("commando generado >>");
        personaje.proteger();
    }
}
