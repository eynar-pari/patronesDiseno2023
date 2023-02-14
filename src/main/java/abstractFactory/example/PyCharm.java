package abstractFactory.example;

public class PyCharm extends Ide{
    @Override
    public void cloning() {
        System.out.println("PyCharm > cloning");
    }

    @Override
    public void code() {
        System.out.println("PyCharm > coding");
    }

    @Override
    public void debug() {
        System.out.println("PyCharm > debugging");
    }

    @Override
    public void build() {
        System.out.println("PyCharm > building");
    }
}
