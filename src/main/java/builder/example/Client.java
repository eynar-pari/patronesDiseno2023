package builder.example;

public class Client {

    public static void main (String[]args){

        Cocinero cocinero = new Cocinero();
        PizzaCarnivora carnivora = new PizzaCarnivora();
        PizzaHawaina hawaina = new PizzaHawaina();
        PizzaTradicional tradicional = new PizzaTradicional();

        cocinero.setTipoPizza(tradicional);
        cocinero.buildPizza();

        Pizza pizza = cocinero.getPizza();
        pizza.showInfo();



    }


}
