package strategy.example;

import java.util.ArrayList;
import java.util.List;

public class EquipoFutbol {
    private List<Jugador> jugadorList = new ArrayList<>();
    private String name;
    private IStrategyGame strategyGame;

    public EquipoFutbol(String name) {
        this.name = name;
    }

    public List<Jugador> getJugadorList() {
        return jugadorList;
    }

    public EquipoFutbol addJugador(Jugador jugador) {
        this.jugadorList.add(jugador);
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IStrategyGame getStrategyGame() {
        return strategyGame;
    }

    public void setStrategyGame(IStrategyGame strategyGame) {
        this.strategyGame = strategyGame;
    }

    public void jugar(){
        this.strategyGame.jugada(this.jugadorList);
    }
}
