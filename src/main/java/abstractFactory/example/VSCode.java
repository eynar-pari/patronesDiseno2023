package abstractFactory.example;

public class VSCode extends Ide{
    @Override
    public void cloning() {
        System.out.println("VSCode > cloning");
    }

    @Override
    public void code() {
        System.out.println("VSCode > coding");
    }

    @Override
    public void debug() {
        System.out.println("VSCode > debugging");
    }

    @Override
    public void build() {
        System.out.println("VSCode > building");
    }
}
