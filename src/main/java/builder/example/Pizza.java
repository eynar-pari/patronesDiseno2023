package builder.example;

public class Pizza {
    private String tipoQueso;
    private String tipoMasa;
    private String preparacion;
    private String tipoCarne;

    private String fruta;

    private String condimentos;

    public String getTipoQueso() {
        return tipoQueso;
    }

    public Pizza setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    public String getTipoMasa() {
        return tipoMasa;
    }

    public Pizza setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
        return this;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public Pizza setPreparacion(String preparacion) {
        this.preparacion = preparacion;
        return this;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public Pizza setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
        return this;
    }


    public String getFruta() {
        return fruta;
    }

    public Pizza setFruta(String fruta) {
        this.fruta = fruta;
        return this;
    }

    public String getCondimentos() {
        return condimentos;
    }

    public Pizza setCondimentos(String condimentos) {
        this.condimentos = condimentos;
        return this;
    }

    public void showInfo() {
        System.out.println("tipoQueso: "+ tipoQueso);
        System.out.println("tipoMasa: "+ tipoMasa);
        System.out.println("preparacion: "+ preparacion);
        System.out.println("tipoCarne: "+ tipoCarne);
        System.out.println("condimentos: "+ condimentos);
        System.out.println("fruta: "+ fruta);
    }
}
