package composite.tempalte;

public class Leaf extends Component{
    public Leaf(String attribute1, String attribute2) {
        super(attribute1, attribute2);
    }

    @Override
    public void operation() {
        System.out.println("Leaf > attribute1: "+getAttribute1());
        System.out.println("Leaf > attribute2: "+getAttribute2());
    }

    @Override
    public void add(Component composite) {
        System.out.println("Este es el objeto simple no puede agregar a otros");
    }

    @Override
    public void remove(Component composite) {
        System.out.println("Este es el objeto simple no puede agregar a otros");

    }

    @Override
    public Component get(int position) {
        System.out.println("Este es el objeto simple no puede agregar a otros");
        return null;
    }
}
