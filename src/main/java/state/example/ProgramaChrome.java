package state.example;

import java.util.Random;

public class ProgramaChrome implements  IStateComputer{
    @Override
    public void computerBehavior(Computadora computadora) {
        int randomUse=(int) ((Math.random() * (100 - 1)) + 1);
        computadora.getMemoryRam().setPercentageUse(randomUse);
        System.out.println("Estado: Utilizando Chrome");
        computadora.getMemoryRam().show();
        computadora.getTargetaVideo().show();
    }
}
