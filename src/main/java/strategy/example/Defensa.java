package strategy.example;

import java.util.List;

public class Defensa implements IStrategyGame{
    @Override
    public void jugada(List<Jugador> equipo) {
        //> los delanteros toman protagonismo

        for (Jugador jugador:equipo){
            jugador.setStrategy("Defensa");
            if (jugador.getPosition().toLowerCase().equals("defensa") || jugador.getPosition().toLowerCase().equals("arquero" )){
                System.out.println("\n>>>> Protagonismo <<<");
                jugador.print();
                System.out.println(">>>><<<<>>>>>> <<<\n");
            }else {
                jugador.print();
            }
        }


    }
}
