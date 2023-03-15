package bridge.example.nobridge;

public class Triangulo implements IFigure{
    @Override
    public int getArea() {
        System.out.println("Triangulo> obteniendo area");
        return 0;
    }

    @Override
    public void pintarRojo() {
        System.out.println("Triangulo> pintarRojo");
    }

    @Override
    public void pintarAmarilla() {
        System.out.println("Triangulo> pintarAmarilla");
    }

    @Override
    public void pintarVerde() {
        System.out.println("Triangulo> pintarVerde");
    }

    @Override
    public void pintarCafe() {
        System.out.println("Triangulo> pintarCafe");
    }

    @Override
    public void pintarNegro() {

    }
}
