package abstractFactory.example;

public class IntelliJ extends Ide{
    @Override
    public void cloning() {
        System.out.println("IntelliJ > cloning");
    }

    @Override
    public void code() {
        System.out.println("IntelliJ > coding");
    }

    @Override
    public void debug() {
        System.out.println("IntelliJ > debugging");
    }

    @Override
    public void build() {
        System.out.println("IntelliJ > building");
    }
}
