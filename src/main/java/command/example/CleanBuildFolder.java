package command.example;

public class CleanBuildFolder implements  ICommand{

    private Ide ide;

    public CleanBuildFolder(Ide ide) {
        this.ide = ide;
    }

    @Override
    public void execute() {
        System.out.println("CMD>");
        this.ide.cleanBuild();
    }
}
