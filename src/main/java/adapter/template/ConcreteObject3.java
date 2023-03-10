package adapter.template;

public class ConcreteObject3 implements IAdapter{
    @Override
    public void method1() {
        System.out.println("ConcreteObject3>method1 ");
    }

    @Override
    public void method2() {
        System.out.println("ConcreteObject3>method12 ");
    }

    @Override
    public void method3() {
        System.out.println("ConcreteObject3>method3 ");
    }

    @Override
    public void operation() {
        System.out.println("ConcreteObject3>operation ");
    }
}
