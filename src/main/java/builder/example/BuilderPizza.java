package builder.example;



public abstract class BuilderPizza {
    protected Pizza pizza;

    public Pizza getPizza(){
        return pizza;
    }

    public void prepararPizza(){
        pizza = new Pizza();
    }

    public abstract void buildTipoQueso();
    public abstract void buildTipoMasa();
    public abstract void buildPreparacion();
    public abstract void buildTipoCarne();
    public abstract void buildFruta();
    public abstract void buildCondimentos();
}
