package chainOfResponsability.practice;

public class Soporte implements ITeamDev {
    private ITeamDev next;

    @Override
    public void setNext(ITeamDev handler) {
        next=handler;
    }

    @Override
    public ITeamDev next() {
        return next;
    }

    @Override
    public void reportDefect(Defect defect) {
          if (defect.getSeverity().toUpperCase().equals("BAJA")){
              System.out.println("INFO > Soporte is reviewing the Defect:");
              defect.showInfo();
          } else {
              System.out.println("ERROR> la severidad: ["+defect.getSeverity()+"] no existe en nuestra cadena de responsabilidad");

          }
    }
}
