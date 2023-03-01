package command.example;

public class StandarizationReview implements  ICommand{

    private Ide ide;

    public StandarizationReview(Ide ide) {
        this.ide = ide;
    }

    @Override
    public void execute() {
        System.out.println("CMD>");
        this.ide.compileCode();
    }
}
