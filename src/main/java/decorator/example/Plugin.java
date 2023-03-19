package decorator.example;

public class Plugin implements IDE{

    private IDE ide;
    private String name;
    private String costo;

    public Plugin(IDE ide,String name,String costo) {
        this.ide = ide;
        this.name = name;
        this.costo = costo;
    }

    @Override
    public void operation() {
        ide.operation();
        System.out.println(">> Plugin <<");
        System.out.println(">> name <<"+this.name);
        System.out.println(">> costo <<"+this.costo);
    }
}
