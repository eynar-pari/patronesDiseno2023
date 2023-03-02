package command.practice;

public class CurarCmd implements IAction{
    private Personaje personaje;

    public CurarCmd(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void execute() {
        System.out.println("commando generado >>");
        personaje.curar();
    }
}
