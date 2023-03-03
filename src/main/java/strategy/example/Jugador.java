package strategy.example;

public class Jugador {
    private String name;
    private String position;
    private String strategy;

    public Jugador(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public void print() {
        String tmp =  "Jugador{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", strategy='" + strategy + '\'' +
                '}';
        System.out.println(tmp);
    }
}
