package bridge.template;

public class ImplementorC implements Implementor{
    @Override
    public void method1() {
        System.out.println("ImplementorC>method1");
    }

    @Override
    public void method2() {
        System.out.println("ImplementorC>method2");
    }
}
