package visitor.example;

public class Gato implements IAnimal{
    private String name;
    private boolean estaEnfermo;

    public Gato(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEstaEnfermo() {
        return estaEnfermo;
    }

    public void setEstaEnfermo(boolean estaEnfermo) {
        this.estaEnfermo = estaEnfermo;
    }

    @Override
    public void accept(IMedico medico) {
        medico.tratamiento(this);
    }

    @Override
    public void run() {
        if (!estaEnfermo)
            System.out.println("corriendo");
    }

    @Override
    public void comer() {
        if (!estaEnfermo)
            System.out.println("comer");
    }
}
