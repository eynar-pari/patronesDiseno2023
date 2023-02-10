package singleton.practice;

public class Factura {
    private String codigo;

    public Factura(String codigo){
        Logger.getInstance().logger("create instance: Factura using: "+codigo);
        this.codigo =codigo;
    }

    public String getCodigo() {
        Logger.getInstance().logger("get codigo using: "+codigo);
        return codigo;
    }

    public void setCodigo(String codigo) {
        Logger.getInstance().logger("set codigo using: "+codigo);
        this.codigo = codigo;
    }
}
