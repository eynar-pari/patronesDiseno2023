package adapter.example;

public class AutoDiesel implements IAutomovil{

    private int combustible = 0;

    @Override
    public void prender() {
        System.out.println("AutoDiesel > prendiendo ...");
        System.out.println("AutoDiesel > Combustible : "+combustible);
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
            System.out.println("funcionando: "+combustible);
        }
    }

    @Override
    public void cargando(int time) {
        for (int i = 0; i < time; i++) {
            combustible = combustible + 5;
            combustible = combustible > 100? 100: combustible;
            System.out.println("cargando: "+combustible);
        }
    }
}
