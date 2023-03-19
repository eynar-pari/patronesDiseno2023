package composite.example;

public class Task extends Component{
    public Task(String titulo, String descripcion, String prioridad, String estimacion, String owner) {
        super(titulo, descripcion, prioridad, estimacion, owner);
    }

    @Override
    public void showInfo() {
        System.out.println(" ---------------------  ");
        System.out.println("\ttitulo: "+getTitulo());
        System.out.println("\tdescripcion: "+getDescripcion());
        System.out.println("\tprioridad: "+getPrioridad());
        System.out.println("\testimacion: "+getEstimacion());
        System.out.println("\towner: "+getOwner());
        System.out.println(" ---------------------  ");
    }

    @Override
    public void add(Component composite) {

    }

    @Override
    public void remove(Component composite) {

    }

    @Override
    public Component get(int position) {
        return null;
    }
}
