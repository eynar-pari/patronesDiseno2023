package singleton.example;

public class Sucursal {
    Client client;
    public Sucursal(Client client){
        this.client=client;
    }

    public void retirarDinero(int amount){
        CuentaBancaria.getInstance().retirarDinero(amount);
    }
}
