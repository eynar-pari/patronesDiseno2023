package bridge.template;

public class ImplementorB implements Implementor{
    @Override
    public void method1() {
        System.out.println("ImplementorB>method1");
    }

    @Override
    public void method2() {
        System.out.println("ImplementorB>method2");
    }
}
