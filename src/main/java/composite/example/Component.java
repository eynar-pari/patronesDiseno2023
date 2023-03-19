package composite.example;

public abstract class Component {

    private String titulo;
    private String descripcion;
    private String prioridad;
    private String estimacion;
    private String owner;

    public Component(String titulo, String descripcion, String prioridad, String estimacion, String owner) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estimacion = estimacion;
        this.owner = owner;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getEstimacion() {
        return estimacion;
    }

    public void setEstimacion(String estimacion) {
        this.estimacion = estimacion;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public abstract void showInfo();
    public abstract void add(Component composite);
    public abstract void remove(Component composite);
    public abstract Component get(int position);

}