package memento.template;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public CareTaker addMemento(Memento memento){
        mementoList.add(memento);
        return this;
    }

    public Memento getMemento(int index){
        return mementoList.get(index);
    }


}
