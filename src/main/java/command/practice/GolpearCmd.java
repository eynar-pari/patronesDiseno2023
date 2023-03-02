package command.practice;

public class GolpearCmd implements IAction{
    private Personaje personaje;

    public GolpearCmd(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void execute() {
        System.out.println("commando generado >>");
        personaje.golpear();
    }
}
