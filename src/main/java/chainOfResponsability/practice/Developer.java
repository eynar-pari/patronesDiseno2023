package chainOfResponsability.practice;

public class Developer implements ITeamDev {
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
          if (defect.getSeverity().toUpperCase().equals("CRITICA")){
              System.out.println("INFO > Developer is reviewing the Defect:");
              defect.showInfo();
          } else {
              System.out.println("WARN> el Developer no tomara responsabilidad del defecto .. pasando cadena de responsabilidad");
              next.reportDefect(defect);
          }
    }
}
