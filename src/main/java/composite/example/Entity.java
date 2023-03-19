package composite.example;

import java.util.ArrayList;
import java.util.List;

public class Entity extends Component{

    List<Component> componentList = new ArrayList<>();

    public Entity(String titulo, String descripcion, String prioridad, String estimacion, String owner) {
        super(titulo, descripcion, prioridad, estimacion, owner);
    }

    @Override
    public void showInfo() {
        System.out.println("> titulo: "+getTitulo());
        System.out.println("descripcion: "+getDescripcion());
        System.out.println("prioridad: "+getPrioridad());
        System.out.println("estimacion: "+getEstimacion());
        System.out.println("owner: "+getOwner());
        for (Component component:componentList
             ) {
            component.showInfo();
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
