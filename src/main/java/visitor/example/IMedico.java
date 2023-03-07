package visitor.example;

public interface IMedico {
    void tratamiento(Gato gato);
    void tratamiento(Caballo caballo);
    void tratamiento(Perro perro);

}
