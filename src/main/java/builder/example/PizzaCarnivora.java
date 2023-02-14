package builder.example;


public class PizzaCarnivora extends BuilderPizza {
    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("Carnivora>Mozarela");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("Carnivora>Doble");
    }

    @Override
    public void buildPreparacion() {
        this.pizza.setPreparacion("Carnivora>Primero la masa, luego el queso, al final la carne");
    }

    @Override
    public void buildTipoCarne() {
        this.pizza.setTipoCarne("Carnivora> carne de res");
    }

    @Override
    public void buildFruta() {
        this.pizza.setFruta("Carnivora> NO TIENE");
    }

    @Override
    public void buildCondimentos() {
        this.pizza.setCondimentos("Carnivora>oregano");
    }
}
