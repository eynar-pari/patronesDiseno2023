package chainOfResponsability.practice;

public class QA implements ITeamDev {
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
          if (defect.getSeverity().toUpperCase().equals("ALTA")){
              System.out.println("INFO > QA is reviewing the Defect:");
              defect.showInfo();
          } else {
              System.out.println("WARN> el QA no tomara responsabilidad del defecto .. pasando cadena de responsabilidad");
              next.reportDefect(defect);
          }
    }
}
