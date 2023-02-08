package singleton.example;

public class Cajero {
    Client client;
    public Cajero(Client client){
        this.client=client;
    }

    public void retirarDinero(int amount){
        CuentaBancaria.getInstance().retirarDinero(amount);
    }
}
