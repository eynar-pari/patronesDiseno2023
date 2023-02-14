package abstractFactory.example;

public class VisualStudio extends Ide{
    @Override
    public void cloning() {
        System.out.println("VisualStudio > cloning");
    }

    @Override
    public void code() {
        System.out.println("VisualStudio > coding");
    }

    @Override
    public void debug() {
        System.out.println("VisualStudio > debugging");
    }

    @Override
    public void build() {
        System.out.println("VisualStudio > building");
    }
}
