package iterator.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class QuantumIterator implements Iterator{
    private List<Automovil> automovils = new ArrayList<>();
    private int position = 0;
    public QuantumIterator(List<Automovil> automovils){
        this.automovils=automovils;
    }

    @Override
    public Automovil next() {
        return this.automovils.get(position++);
    }

    @Override
    public boolean hasNext() {
        return this.automovils.size() != 0 && position < this.automovils.size();
    }
}
