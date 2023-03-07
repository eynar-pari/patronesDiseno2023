package templateMethod;

public abstract class Parent {

    public void method1(){
        System.out.println("Parent > method1");
    }

    public final void method2(){
        System.out.println("Parent > method2");
    }

    abstract void method3Abs();

}
