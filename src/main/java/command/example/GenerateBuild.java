package command.example;

public class GenerateBuild implements  ICommand{

    private Ide ide;

    public GenerateBuild(Ide ide) {
        this.ide = ide;
    }

    @Override
    public void execute() {
        System.out.println("CMD>");
        this.ide.createJarFile();
    }
}
