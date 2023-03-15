package bridge.example.nobridge;

public class Circulo implements IFigure{
    @Override
    public int getArea() {
        System.out.println("Circulo> obteniendo area");
        return 0;
    }

    @Override
    public void pintarRojo() {
        System.out.println("Circulo> pintarRojo");
    }

    @Override
    public void pintarAmarilla() {
        System.out.println("Circulo> pintarAmarilla");
    }

    @Override
    public void pintarVerde() {
        System.out.println("Circulo> pintarVerde");
    }

    @Override
    public void pintarCafe() {
        System.out.println("Circulo> pintarCafe");
    }

    @Override
    public void pintarNegro() {
        System.out.println("Circulo> negro");
    }
}
