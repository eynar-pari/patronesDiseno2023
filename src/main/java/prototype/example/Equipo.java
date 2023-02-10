package prototype.example;

public class Equipo {
    private String name;
    private String numberPlayer;

    public Equipo(String name, String numberPlayer) {
        this.name = name;
        this.numberPlayer = numberPlayer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberPlayer(String numberPlayer) {
        this.numberPlayer = numberPlayer;
    }

    public String getName() {
        return name;
    }

    public String getNumberPlayer() {
        return numberPlayer;
    }


    public void showInfo() {
        System.out.println("INFO>Equipo- name: "+name);
        System.out.println("INFO>Equipo- numberPlayer: "+numberPlayer);
    }
}
