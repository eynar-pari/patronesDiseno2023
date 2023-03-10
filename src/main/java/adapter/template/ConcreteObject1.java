package adapter.template;

public class ConcreteObject1 implements IAdapter{
    @Override
    public void method1() {
        System.out.println("ConcreteObject1>method1 ");
    }

    @Override
    public void method2() {
        System.out.println("ConcreteObject1>method12 ");
    }

    @Override
    public void method3() {
        System.out.println("ConcreteObject1>method3 ");
    }

    @Override
    public void operation() {
        System.out.println("ConcreteObject1>operation ");
    }
}
