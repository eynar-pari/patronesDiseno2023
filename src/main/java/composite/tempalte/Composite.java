package composite.tempalte;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    private String attribute1Composite;

    private List<Component> componentList = new ArrayList<>();

    public Composite(String attribute1, String attribute2) {
        super(attribute1, attribute2);
    }

    @Override
    public void operation() {
        System.out.println("Composite>   attribute1:" +getAttribute1());
        System.out.println("Composite>    attribute2: "+getAttribute2());
        for (Component component:componentList
             ) {
            component.operation();
        }
    }

    @Override
    public void add(Component composite) {
        componentList.add(composite);
    }

    @Override
    public void remove(Component composite) {
        componentList.remove(composite);
    }

    @Override
    public Component get(int position) {
        return componentList.get(position);
    }
}
