package command.practice;

public class SaltarCmd implements IAction{
    private Personaje personaje;

    public SaltarCmd(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void execute() {
        System.out.println("commando generado >>");
        personaje.saltar();
    }
}
