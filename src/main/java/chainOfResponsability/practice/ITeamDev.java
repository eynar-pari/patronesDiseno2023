package chainOfResponsability.practice;

public interface ITeamDev {
    void setNext(ITeamDev handler);
    ITeamDev next();
    void reportDefect(Defect defect);

}
