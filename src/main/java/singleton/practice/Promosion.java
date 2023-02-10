package singleton.practice;

public class Promosion {
    private String tipo;

    public Promosion(String tipo){
        Logger.getInstance().logger("create instance: Promosion using: "+tipo);
        this.tipo =tipo;
    }

    public String getTipo() {
        Logger.getInstance().logger("get  tipo using: "+tipo);
        return tipo;
    }

    public void setTipo(String tipo) {
        Logger.getInstance().logger("set tipo using: "+tipo);
        this.tipo = tipo;
    }
}
