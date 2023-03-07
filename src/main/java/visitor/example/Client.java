package visitor.example;

public class Client {
    public static void main(String []args){
        Gato gato = new Gato("Felix");
        gato.setEstaEnfermo(true);

        Perro perro = new Perro("Bobby");
        perro.setEstaEnfermo(false);

        Caballo caballo = new Caballo("Giga");
        caballo.setEstaEnfermo(true);

        Veterinario veterinario = new Veterinario();

        gato.accept(veterinario);
        perro.accept(veterinario);
        caballo.accept(veterinario);


    }
}
