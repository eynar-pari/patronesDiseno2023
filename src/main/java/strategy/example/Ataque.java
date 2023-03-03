package strategy.example;

import java.util.List;

public class Ataque implements IStrategyGame{
    @Override
    public void jugada(List<Jugador> equipo) {
        //> los delanteros toman protagonismo

        for (Jugador jugador:equipo){
            jugador.setStrategy("Ataque");
            if (jugador.getPosition().toLowerCase().equals("delantero")){
                System.out.println("\n>>>> Protagonismo <<<");
                jugador.print();
                System.out.println(">>>><<<<>>>>>> <<<\n");
            }else {
                jugador.print();
            }
        }


    }
}
