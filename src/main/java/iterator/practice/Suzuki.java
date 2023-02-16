package iterator.practice;

import java.util.Vector;

public class Suzuki implements IAggregate {
    private Vector<Automovil> automovils = new Vector<Automovil>();
    private String sucursal;
    private String gerente;

    public Vector<Automovil> getAutomovils() {
        return automovils;
    }


    public void addAutomovil(Automovil automovil) {
        this.automovils.add(automovil);
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public SuzukiIterator createIterator() {
        return new SuzukiIterator(automovils);
    }
}
