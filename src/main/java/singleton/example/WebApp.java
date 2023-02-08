package singleton.example;

public class WebApp {
    Client client;
    public WebApp(Client client){
        this.client=client;
    }

    public void transferirDinero(int amount,String cuentaDestion){
        CuentaBancaria.getInstance().retirarDinero(amount);
    }
}
