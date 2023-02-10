package prototype.example;

public class Persona {
    private String name;
    private String ci;

    public Persona(String name, String ci) {
        this.name = name;
        this.ci = ci;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public String getCi() {
        return ci;
    }


    public void showInfo() {
        System.out.println("INFO>Persona- name: "+name);
        System.out.println("INFO>Persona- ci: "+ ci);
    }
}
