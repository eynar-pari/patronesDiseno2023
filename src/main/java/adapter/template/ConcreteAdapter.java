package adapter.template;

public class ConcreteAdapter implements IAdapter{

    // agregar al objeto que se necesitamos adaptar como attribute

    private Adaptee adaptee;

    public ConcreteAdapter(Adaptee adaptee){
        this.adaptee= new Adaptee();
    }

    @Override
    public void method1() {
        this.adaptee.getAttribute1();
        this.adaptee.operation1();
    }

    @Override
    public void method2() {
        this.adaptee.operation2();
    }

    @Override
    public void method3() {
        this.adaptee.operation3();
    }

    @Override
    public void operation() {
        // logica antes

        this.adaptee.setAttribute1("abc");
        this.adaptee.method();

        // logica despues
    }
}
