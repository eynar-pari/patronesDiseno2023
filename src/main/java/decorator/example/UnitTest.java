package decorator.example;

public class UnitTest extends Plugin{
    public UnitTest(IDE ide, String name, String costo) {
        super(ide, name, costo);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println(">> Plugin << --> UnitTest");
    }

}
