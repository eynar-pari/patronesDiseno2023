package command.example;

public class UnitTestExecution implements  ICommand{

    private Ide ide;

    public UnitTestExecution(Ide ide) {
        this.ide = ide;
    }

    @Override
    public void execute() {
        System.out.println("CMD>");
        this.ide.runUnitTest();
    }
}
