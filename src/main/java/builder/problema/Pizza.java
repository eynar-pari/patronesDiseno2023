package builder.problema;

public class Pizza {
    private String tipoQueso;
    private String tipoMasa;
    private String fruta;
    private String tipoPreparacion;

    public Pizza(){}

    public Pizza(String tipoQueso, String tipoMasa, String fruta, String tipoPreparacion) {
        this.tipoQueso = tipoQueso;
        this.tipoMasa = tipoMasa;
        this.fruta = fruta;
        this.tipoPreparacion = tipoPreparacion;
    }

    public Pizza(String tipoQueso, String tipoMasa, String tipoPreparacion) {
        this.tipoQueso = tipoQueso;
        this.tipoMasa = tipoMasa;
        this.tipoPreparacion = tipoPreparacion;
    }

    public Pizza(String tipoQueso, String tipoMasa) {
        this.tipoQueso = tipoQueso;
        this.tipoMasa = tipoMasa;
    }

    public void PizzaTradicional(){
        this.tipoQueso = "mozarela";
        this.tipoMasa = "especial";
        this.fruta = "notiene";
        this.tipoPreparacion = "clasica";
    }
    public void PizzaHawaina(){
        this.tipoQueso = "mozarela";
        this.tipoMasa = "especial";
        this.fruta = "notiene";
        this.tipoPreparacion = "clasica";
    }
    public void PizzaCarnivora(){
        this.tipoQueso = "mozarela";
        this.tipoMasa = "especial";
        this.fruta = "notiene";
        this.tipoPreparacion = "clasica";
    }


}
