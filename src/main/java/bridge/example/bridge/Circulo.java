package bridge.example.bridge;

public class Circulo implements IFigura{

    private IColor color;

    public Circulo(IColor color) {
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
        System.out.println("Circulo > obteniendo area");
        return 0;

    }

    @Override
    public void pintar() {
        System.out.println(">> Circulo <<");
        this.color.pintar();
    }
}
