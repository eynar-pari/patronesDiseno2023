package singleton.practice;

public class Producto {
    private String name;

    public Producto(String name){
        Logger.getInstance().logger("create instance: Producto using: "+name);
        this.name=name;
    }

    public String getName() {
        Logger.getInstance().logger("get name using: "+name);
        return name;
    }

    public void setName(String name) {
        Logger.getInstance().logger("set name using: "+name);
        this.name = name;
    }
}
