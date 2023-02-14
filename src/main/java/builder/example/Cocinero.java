package builder.example;



public class Cocinero {
    private BuilderPizza builder;

    public Pizza getPizza(){
        return builder.getPizza();
    }

    public void setTipoPizza(BuilderPizza builder){
        this.builder = builder;
    }

    public void buildPizza(){
        this.builder.prepararPizza();
        this.builder.buildFruta();
        this.builder.buildCondimentos();
        this.builder.buildPreparacion();
        this.builder.buildTipoQueso();
        this.builder.buildTipoMasa();
        this.builder.buildTipoCarne();
    }


}
