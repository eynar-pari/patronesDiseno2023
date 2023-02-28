package chainOfResponsability.example;

public class Client {

    public static void main(String[]args){
        Banco banco = new Banco();

        banco.prestamo(new Persona("eynar","5555","50"),500);


    }
}
