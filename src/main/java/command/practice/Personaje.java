package command.practice;

public class Personaje {
    private String name;
    private String level;
    private String category;

    public Personaje(String name, String level, String category) {
        this.name = name;
        this.level = level;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void info(){
        System.out.println("name: "+name);
        System.out.println("level: "+level);
        System.out.println("category: "+category);
    }

    // saltar, correr, golpear, protegerse y curarse

    public void saltar(){
        System.out.println("Accion > El Personaje esta Saltando");
    }
    public void golpear(){
        System.out.println("Accion > El Personaje esta Golpeando");
    }
    public void correr(){
        System.out.println("Accion > El Personaje esta Corriendo");
    }
    public void proteger(){
        System.out.println("Accion > El Personaje esta Protegiendo");
    }
    public void curar(){
        System.out.println("Accion > El Personaje esta Curandose");
    }
}
