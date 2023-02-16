package iterator.practice;

import java.util.Stack;
import java.util.Vector;

public class Toyota implements IAggregate{
    private Stack<Automovil> automovils = new Stack<>();
    private String sucursal;
    private String gerente;

    public Stack<Automovil> getAutomovils() {
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
    public ToyotaIterator createIterator() {
        return new ToyotaIterator(automovils);
    }
}
