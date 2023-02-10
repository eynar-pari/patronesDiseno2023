package prototype.practice;

public class Sim {
    private String nombreEmpresa;
    private String numero;

    public Sim() {
    }

    public Sim(String nombreEmpresa, String numero) {
        this.nombreEmpresa = nombreEmpresa;
        this.numero = numero;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void showInfo(){
        System.out.println("INFO> SIM nombreEmpresa: "+nombreEmpresa);
        System.out.println("INFO> SIM numero: "+numero);
    }

}
