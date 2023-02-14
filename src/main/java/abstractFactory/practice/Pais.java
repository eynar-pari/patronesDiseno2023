package abstractFactory.practice;

public class Pais {
    private String nombre;
    private String ciudad;
    private String aeropuerto;

    public Pais() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public void printInfo(){
        System.out.println("Pais> nombre:"+nombre);
        System.out.println("Pais> ciudad:"+ciudad);
        System.out.println("Pais> aeropuerto:"+aeropuerto);

    }
}
