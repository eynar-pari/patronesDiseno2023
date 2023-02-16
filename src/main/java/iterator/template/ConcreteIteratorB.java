package iterator.template;

import java.util.List;
import java.util.Vector;

public class ConcreteIteratorB implements Iterator{
    private List<String> names;
    private int position = 0;

    public ConcreteIteratorB(List<String> names){
        this.names=names;
    }


    @Override
    public Object next() {
        return this.names.get(position++);
    }


    @Override
    public boolean hasNext() {
        return this.names.size() != 0 && position < this.names.size() ;
    }
}
