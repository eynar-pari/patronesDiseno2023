package decorator.example;

public class DeployDocker extends Plugin{
    public DeployDocker(IDE ide, String name, String costo) {
        super(ide, name, costo);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println(">> Plugin << --> DeployDocker");
    }

}
