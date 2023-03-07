package templateMethod;

public class Child extends Parent {
    @Override
    void method3Abs() {
        System.out.println("Child > method3");
    }

    @Override
    public void method1(){
        super.method1();
        System.out.println("Child > method1");
    }
}
