package bridge.example.bridge;

public class Rectangulo implements IFigura{

    private IColor color;

    public Rectangulo(IColor color) {
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
        System.out.println("Rectangulo > obteniendo area");
        return 0;

    }

    @Override
    public void pintar() {
        System.out.println(">> Rectangulo <<");
        this.color.pintar();
    }
}
