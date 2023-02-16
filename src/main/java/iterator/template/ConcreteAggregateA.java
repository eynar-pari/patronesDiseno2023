package iterator.template;

public class ConcreteAggregateA implements  IAggregate{

    // collection - store object
    private String [] names;
    private int position=0;
    private String attribute1;
    private String attribute2;
    private String attribute3;

    public ConcreteAggregateA() {
        names = new String[5];
    }

    public String[] getNames() {
        return names;
    }

    public void addName(String name) {
        names[position] = name;
        position++;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    @Override
    public ConcreteIteratorA createIterator() {
        return new ConcreteIteratorA(this.names);
    }
}
