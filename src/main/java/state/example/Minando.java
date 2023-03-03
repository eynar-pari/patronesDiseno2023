package state.example;

public class Minando implements  IStateComputer{
    @Override
    public void computerBehavior(Computadora computadora) {

        int actualUse = computadora.getTargetaVideo().getPercentageUse();

        while (computadora.getTargetaVideo().getPercentageUse() <= 100){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(">>> incrementando cada 5 segundo .... <<<");
            actualUse = actualUse + 5;
            computadora.getTargetaVideo().setPercentageUse(actualUse);
            computadora.getTargetaVideo().show();
            if (actualUse > 100){
                computadora.getTargetaVideo().setPercentageUse(100);
            }
        }

        System.out.println(">>> estamos al 100%  <<<");
        computadora.getTargetaVideo().show();
    }
}
