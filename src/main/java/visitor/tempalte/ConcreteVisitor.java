package visitor.tempalte;

public class ConcreteVisitor implements IVisit {


    @Override
    public void visit(ConcreteObject1 concreteObject1) {
        //logica
        System.out.println("El Visitante > visita a > ConcreteObject1");
        concreteObject1.method1();
        concreteObject1.method2();
        concreteObject1.method3();
    }

    @Override
    public void visit(ConcreteObject2 concreteObject2) {
       // logica
        System.out.println("El Visitante > visita a > concreteObject2");
        concreteObject2.method1();
        concreteObject2.method2();
        concreteObject2.method3();
    }
}
