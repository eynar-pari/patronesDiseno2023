package proxy.template;


public class RealSubject implements ISubject {

    private String attribute1;
    private String attribute2;
    private String attribute3;

    public RealSubject() {
    }

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

    @Override
    public void request() {
        System.out.println("usando el objeto real"+ this.attribute1);
    }
}
