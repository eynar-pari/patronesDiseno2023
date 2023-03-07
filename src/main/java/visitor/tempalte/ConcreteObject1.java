package visitor.tempalte;

public class ConcreteObject1 implements IConcreteInterface,IElement{
    @Override
    public void method1() {
        System.out.println("ConcreteObject1>method1");
    }

    @Override
    public void method2() {
        System.out.println("ConcreteObject1>method2");
    }

    @Override
    public void method3() {
        System.out.println("ConcreteObject1>method3");
    }

    @Override
    public void accept(IVisit visit) {
        System.out.println("ConcreteObject1>accept");
        visit.visit(this);
    }
}
