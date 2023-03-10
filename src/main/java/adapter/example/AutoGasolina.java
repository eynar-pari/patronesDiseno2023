package adapter.example;

public class AutoGasolina implements IAutomovil{
    private int combustible = 0;

    @Override
    public void prender() {
        System.out.println("AutoGasolina > prendiendo ...");
        System.out.println("AutoGasolina > Combustible : "+combustible);
    }

    @Override
    public void marcha(int time ) {
        for (int i = 0; i < time; i=i+5) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            combustible = combustible - 5;
            combustible = combustible < 0? 0: combustible;
            System.out.println("AutoGasolina>funcionando: "+combustible);
        }
    }

    @Override
    public void cargando(int time) {
        for (int i = 0; i < time; i++) {
            combustible = combustible + 1;
            combustible = combustible > 100? 100: combustible;
            System.out.println("AutoGasolina>cargando: "+combustible);
        }
    }
}
