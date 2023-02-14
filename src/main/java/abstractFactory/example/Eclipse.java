package abstractFactory.example;

public class Eclipse extends Ide{
    @Override
    public void cloning() {
        System.out.println("Eclipse > cloning");
    }

    @Override
    public void code() {
        System.out.println("Eclipse > coding");
    }

    @Override
    public void debug() {
        System.out.println("Eclipse > debugging");
    }

    @Override
    public void build() {
        System.out.println("Eclipse > building");
    }
}
