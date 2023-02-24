package memento.template;

public class ConcreteObject {
    private String attribute1;
    private String attibute2;
    private String state;

    public ConcreteObject(String attribute1, String attibute2, String state) {
        this.attribute1 = attribute1;
        this.attibute2 = attibute2;
        this.state = state;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttibute2() {
        return attibute2;
    }

    public void setAttibute2(String attibute2) {
        this.attibute2 = attibute2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void showInfo(){
        System.out.println("------------");
        System.out.println("attribute1: "+attribute1);
        System.out.println("attibute2: "+attibute2);
        System.out.println("state: "+state);
        System.out.println("************");
    }

}
