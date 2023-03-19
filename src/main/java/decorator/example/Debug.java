package decorator.example;

public class Debug extends Plugin{
    public Debug(IDE ide, String name, String costo) {
        super(ide, name, costo);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println(">> Plugin << --> Debug");
    }

}
