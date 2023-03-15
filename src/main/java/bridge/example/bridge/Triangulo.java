package bridge.example.bridge;

public class Triangulo implements IFigura{

    private IColor color;

    public Triangulo(IColor color) {
        this.color = color;
    }

    public IColor getColor() {
        return color;
    }

    public void setColor(IColor color) {
        this.color = color;
    }

    @Override
    public int getArea() {
        System.out.println("Triangulo > obteniendo area");
        return 0;

    }

    @Override
    public void pintar() {
        System.out.println(">> Triangulo <<");
        this.color.pintar();
    }
}
