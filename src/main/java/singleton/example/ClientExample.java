package singleton.example;

public class ClientExample {
    public static void main(String []args) throws InterruptedException {
        Thread s1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Sucursal sucursalA = new Sucursal(new Client("Jose"));
                sucursalA.retirarDinero(100);
            }
        });

        Thread c1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Cajero cajero = new Cajero(new Client("Jose"));
                cajero.retirarDinero(200);
            }
        });

        Thread app = new Thread(new Runnable() {
            @Override
            public void run() {
                WebApp webApp = new WebApp(new Client("Jose"));
                webApp.transferirDinero(300,"5468713");
                 }
        });

        s1.start();
        c1.start();
        app.start();
        Thread.sleep(2000);
        CuentaBancaria.getInstance().saldoActual();
    }
}
