package bridge.example.nobridge;

public class Rectangulo implements IFigure{
    @Override
    public int getArea() {
        System.out.println("Rectangulo> obteniendo area");
        return 0;
    }

    @Override
    public void pintarRojo() {
        System.out.println("Rectangulo> pintarRojo");
    }

    @Override
    public void pintarAmarilla() {
        System.out.println("Rectangulo> pintarAmarilla");
    }

    @Override
    public void pintarVerde() {
        System.out.println("Rectangulo> pintarVerde");
    }

    @Override
    public void pintarCafe() {
        System.out.println("Rectangulo> pintarCafe");
    }

    @Override
    public void pintarNegro() {
        System.out.println("Rectangulo> negro");
    }
}
