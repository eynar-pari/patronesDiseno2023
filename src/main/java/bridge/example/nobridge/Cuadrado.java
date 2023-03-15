package bridge.example.nobridge;

public class Cuadrado implements IFigure{
    @Override
    public int getArea() {
        System.out.println("Cuadrado> obteniendo area");
        return 0;
    }

    @Override
    public void pintarRojo() {
        System.out.println("Cuadrado> pintarRojo");
    }

    @Override
    public void pintarAmarilla() {
        System.out.println("Cuadrado> pintarAmarilla");
    }

    @Override
    public void pintarVerde() {
        System.out.println("Cuadrado> pintarVerde");
    }

    @Override
    public void pintarCafe() {
        throw new RuntimeException("ERROR");
    }

    @Override
    public void pintarNegro() {

    }


}
