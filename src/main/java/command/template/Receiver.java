package command.template;

// concrete object
public class Receiver {
    private String attribute1;
    private String attribute2;
    private String attribute3;

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

    //actions

    public void action1(){
        System.out.println("INFO> Receiver ejecutamos action 1");
    }

    public void action2(){
        System.out.println("INFO> Receiver ejecutamos action 2");
    }

    public void action3(){
        System.out.println("INFO> Receiver ejecutamos action 3");
    }

}
