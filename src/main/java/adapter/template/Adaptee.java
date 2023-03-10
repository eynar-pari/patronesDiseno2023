package adapter.template;

public class Adaptee{

    private String attribute1;
    private String attribute2;
    private String attribute3;

    public Adaptee(){}

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public void operation1(){
        System.out.println("Adaptee > operation1");
    }
    public void operation2(){
        System.out.println("Adaptee > operation2");
    }
    public void operation3(){
        System.out.println("Adaptee > operation3");
    }
    public void method(){
        System.out.println("Adaptee > method");
    }
}
