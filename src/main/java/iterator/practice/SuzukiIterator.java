package iterator.practice;

import java.util.Vector;

public class SuzukiIterator implements Iterator{
    private Vector<Automovil> automovils = new Vector<Automovil>();
    private int position = 0;
    public SuzukiIterator(Vector<Automovil> automovils){
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
