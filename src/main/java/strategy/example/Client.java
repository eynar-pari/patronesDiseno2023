package strategy.example;

public class Client {

    public static void main(String []args){

        EquipoFutbol equipoFutbol = new EquipoFutbol("Simpson");
        equipoFutbol.addJugador(new Jugador("Vivian","Delantero"))
                .addJugador(new Jugador("Pabloe","Arquero"))
                .addJugador(new Jugador("Jose","Defensa"))
                .addJugador(new Jugador("Katzumi","Defensa"))
                .addJugador(new Jugador("Hugo","Medio Campista"));

        String tipoPartido="visitande";

        // condicion para saber cual es la mejor estrategia a usar

        if (tipoPartido.equals("local")){
            equipoFutbol.setStrategyGame(new Ataque());
        }else{
            equipoFutbol.setStrategyGame(new Defensa());
        }

        equipoFutbol.jugar();
    }

}
