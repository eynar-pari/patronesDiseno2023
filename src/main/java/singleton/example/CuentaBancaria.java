package singleton.example;

public class CuentaBancaria {

    // attributo del mismo tipo
    private static CuentaBancaria instance = null;
    private int saldo;

    // constructor privado
    private CuentaBancaria(){
        saldo = 1000;
        System.out.println("INFO > Saldo Inicial: "+saldo);
    }

    private synchronized static void create(){
        if (instance == null)
            instance = new CuentaBancaria();
    }

    // acceso global - metodo estatico publico que retorne la instancia unica
    public static CuentaBancaria getInstance(){
        if (instance == null)
            create();
        return instance;
    }

    public synchronized void retirarDinero(int amount){
        if (amount <= saldo){
            saldo=saldo-amount;
            System.out.println("INFO> operacion satisfactoria: cantidad a retirar: "+amount+", nuevo saldo:"+saldo);
        }else{
            System.out.println("ERROR> no se puede retirar esa cantidad: "+amount+", el saldo que tiene: "+saldo);
        }
    }

    public void saldoActual(){
        System.out.println("INFO > tu saldo es : "+saldo);
    }
}
