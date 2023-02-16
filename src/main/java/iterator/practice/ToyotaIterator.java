package iterator.practice;

import java.util.Stack;
import java.util.Vector;

public class ToyotaIterator implements Iterator{
    private Stack<Automovil> automovils = new Stack<>();
    private int position = 0;
    public ToyotaIterator(Stack<Automovil> automovils){
        this.automovils=automovils;
    }

    @Override
    public Automovil next() {
        return this.automovils.get(position++);
    }

    @Override
    public boolean hasNext() {
        return !this.automovils.isEmpty() && position < this.automovils.size();
    }
}
