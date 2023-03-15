package bridge.template;

public class Abstraction2 implements IAbstraction{
    private Implementor implementor;

    public Abstraction2(Implementor implementor) {
        this.implementor = implementor;
    }

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    @Override
    public void operation1() {
        System.out.println("Abstraction2");
        this.implementor.method1();
    }

    @Override
    public void operation2() {
        System.out.println("Abstraction2");
        this.implementor.method2();
    }
}
