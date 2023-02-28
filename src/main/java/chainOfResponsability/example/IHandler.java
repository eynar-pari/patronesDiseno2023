package chainOfResponsability.example;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();

    void prestamo(Persona persona, int amount);

}
