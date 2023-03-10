package adapter.example;

public class AutoGasolinaEspecial implements IAutomovil{
    private int combustible = 0;

    @Override
    public void prender() {
        System.out.println("AutoGasolinaEspecial > prendiendo ...");
        System.out.println("AutoGasolinaEspecial > Combustible : "+combustible);
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
            System.out.println("AutoGasolinaEspecial>funcionando: "+combustible);
        }
    }

    @Override
    public void cargando(int time) {
        for (int i = 0; i < time; i++) {
            combustible = combustible + 3;
            combustible = combustible > 100? 100: combustible;
            System.out.println("AutoGasolinaEspecial>cargando: "+combustible);
        }
    }
}
