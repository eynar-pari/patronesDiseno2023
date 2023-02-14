package builder.template;

public class Product {
    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String attribute4;

    public String getAttribute1() {
        return attribute1;
    }

    public Product setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
        return this;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public Product setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
        return this;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public Product setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
        return this;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public Product setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
        return this;
    }

    public void showInfo() {
        System.out.println("attribute1: "+attribute1);
        System.out.println("attribute2: "+attribute2);
        System.out.println("attribute3: "+attribute3);
        System.out.println("attribute4: "+attribute4);


    }
}
