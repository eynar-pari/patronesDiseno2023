package visitor.example;

public interface IAnimal {
    void accept (IMedico medico);
    void run();
    void comer();
}
