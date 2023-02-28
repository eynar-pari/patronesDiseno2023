package chainOfResponsability.example;



public class Banco implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void prestamo(Persona persona,int amount) {

        Asesor asesor = new Asesor();
        Director director = new Director();
        Gerente gerente = new Gerente();
        Presidente presidente = new Presidente();

        this.setNext(asesor);
        asesor.setNext(director);
        director.setNext(gerente);
        gerente.setNext(presidente);

        this.next.prestamo(persona,amount);

    }
}
