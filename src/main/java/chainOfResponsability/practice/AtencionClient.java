package chainOfResponsability.practice;

public class AtencionClient implements ITeamDev {
    private ITeamDev next;
    private Developer developer = new Developer();
    private QA qa = new QA();
    private PO po = new PO();
    private Soporte soporte= new Soporte();

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
         this.setNext(developer);
         developer.setNext(qa);
         qa.setNext(po);
         po.setNext(soporte);
         next.reportDefect(defect);
    }
}
