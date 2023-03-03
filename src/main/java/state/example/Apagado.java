package state.example;

public class Apagado implements  IStateComputer{
    @Override
    public void computerBehavior(Computadora computadora) {
           computadora.getMemoryRam().setPercentageUse(0);
           computadora.getTargetaVideo().setPercentageUse(0);
           System.out.println("Estado: Apagado");
           computadora.getMemoryRam().show();
           computadora.getTargetaVideo().show();
    }
}
