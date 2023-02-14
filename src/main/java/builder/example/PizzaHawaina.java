package builder.example;


public class PizzaHawaina extends BuilderPizza {
    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("Tradiciona>Mozarela");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("Tradiciona>Simple");
    }

    @Override
    public void buildPreparacion() {
        this.pizza.setPreparacion("Tradiciona>Primero la masa, luego el queso, al final la fruta");
    }

    @Override
    public void buildTipoCarne() {
        this.pizza.setTipoCarne("Tradiciona> NO TIENE");
    }

    @Override
    public void buildFruta() {
        this.pizza.setFruta("Tradiciona> pina y cerezas");
    }

    @Override
    public void buildCondimentos() {
        this.pizza.setCondimentos("Tradiciona>oregano picante");
    }
}
