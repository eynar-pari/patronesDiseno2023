package chainOfResponsability.practice;

public class PO implements ITeamDev {
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
          if (defect.getSeverity().toUpperCase().equals("MEDIA")){
              System.out.println("INFO > PO is reviewing the Defect:");
              defect.showInfo();
          } else {
              System.out.println("WARN> el PO no tomara responsabilidad del defecto .. pasando cadena de responsabilidad");
              next.reportDefect(defect);
          }
    }
}
