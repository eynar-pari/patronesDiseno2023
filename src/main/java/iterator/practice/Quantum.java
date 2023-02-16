package iterator.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Quantum implements IAggregate {
    private List<Automovil> automovils = new ArrayList<>();
    private String sucursal;
    private String gerente;

    public List<Automovil> getAutomovils() {
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
    public QuantumIterator createIterator() {
        return new QuantumIterator(automovils);
    }
}
