package bridge.example.bridge;

public class Cuadrado implements IFigura{

    private IColor color;

    public Cuadrado(IColor color) {
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
        System.out.println("Cuadrado > obteniendo area");
        return 0;

    }

    @Override
    public void pintar() {
        System.out.println(">> Cuadrado <<");
        this.color.pintar();
    }
}
