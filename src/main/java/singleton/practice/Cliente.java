package singleton.practice;

public class Cliente {
    private String ci;

    public Cliente(String ci){
        Logger.getInstance().logger("create instance: Cliente using: "+ci);
        this.ci =ci;
    }

    public String getCi() {
        Logger.getInstance().logger("get the ci value: "+ci);
        return ci;
    }

    public void setCi(String ci) {
        Logger.getInstance().logger("set the ci value: "+ci);
        this.ci = ci;
    }
}
