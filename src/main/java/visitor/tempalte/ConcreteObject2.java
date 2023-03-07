package visitor.tempalte;

public class ConcreteObject2 implements IConcreteInterface, IElement{
    @Override
    public void method1() {
        System.out.println("ConcreteObject2>method1");
    }

    @Override
    public void method2() {
        System.out.println("ConcreteObject2>method1");
    }

    @Override
    public void method3() {
        System.out.println("ConcreteObject2>method1");
    }

    @Override
    public void accept(IVisit visit) {
        System.out.println("ConcreteObject2>accept");
        visit.visit(this);
    }
}
