package builder.example;


public class PizzaTradicional extends BuilderPizza {
    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("Tradiciona>Mozarela");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("Tradiciona>Doble");
    }

    @Override
    public void buildPreparacion() {
        this.pizza.setPreparacion("Tradiciona>Primero la masa, luego el queso");
    }

    @Override
    public void buildTipoCarne() {
        this.pizza.setTipoCarne("Tradiciona> NO TIENE");
    }

    @Override
    public void buildFruta() {
        this.pizza.setFruta("Tradiciona> NO TIENE");
    }

    @Override
    public void buildCondimentos() {
        this.pizza.setCondimentos("Tradiciona>oregano");
    }
}
