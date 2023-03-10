package adapter.example;

public class MotoElectrico implements IElectrico{
    private int bateria=0;
    private int timeBateria=50;

    @Override
    public void enceder() {
        System.out.println("AutoElectrico>bateria: "+bateria);
        System.out.println("AutoElectrico>timeBateria: "+timeBateria);
    }

    @Override
    public void utilizar(int time) {
        for (int i = 0; i < time; i=i+5) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            bateria = bateria - 2;
            bateria = bateria < 0? 0: bateria;
            System.out.println("funcionando: "+bateria);
        }

    }

    @Override
    public void carga(int time) {
        for (int i = 0; i < time; i++) {
            bateria = bateria + 15;
            bateria = bateria > 100? 100: bateria;
            System.out.println("cargando: "+bateria+ "%");
            state();
        }
    }

    @Override
    public void state() {
        System.out.println("bateria: "+bateria);
        System.out.println("tiempo de vida: ["+timeBateria+"] semanas");
    }
}
