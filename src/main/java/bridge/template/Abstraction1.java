package bridge.template;

public class Abstraction1 implements IAbstraction{
    private Implementor implementor;

    public Abstraction1(Implementor implementor) {
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
        System.out.println("Abstraction1");
        this.implementor.method1();
    }

    @Override
    public void operation2() {
        System.out.println("Abstraction1");
        this.implementor.method2();
    }
}
