package bridge.template;

public class ImplementorA implements Implementor{
    @Override
    public void method1() {
        System.out.println("ImplementorA>method1");
    }

    @Override
    public void method2() {
        System.out.println("ImplementorA>method2");
    }
}
