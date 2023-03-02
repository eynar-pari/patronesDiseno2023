package command.practice;

public class Client {
    public static void main (String[]args){
        Personaje guerrero = new Personaje("Attack","5","humano");
        CorrerCmd correrCmd = new CorrerCmd(guerrero);
        CurarCmd curarCmd = new CurarCmd(guerrero);
        ProtegerCmd protegerCmd = new ProtegerCmd(guerrero);
        GolpearCmd golpearCmd = new GolpearCmd(guerrero);
        SaltarCmd saltarCmd = new SaltarCmd(guerrero);

        ActionCreator regeneracion = new ActionCreator();
        regeneracion.addAction(protegerCmd).addAction(curarCmd);
        ActionCreator ataque = new ActionCreator();
        ataque.addAction(saltarCmd).addAction(correrCmd).addAction(golpearCmd);

        ActionCreator contraAtaque = new ActionCreator();
        contraAtaque.addAction(correrCmd).addAction(saltarCmd).addAction(correrCmd)
                .addAction(saltarCmd).addAction(protegerCmd).addAction(golpearCmd)
                .addAction(curarCmd).addAction(correrCmd);

        // nivel 1  correr
        System.out.println("LEVEL1");
        guerrero.correr();

        // nivel 2  regeneracion
        System.out.println("LEVEL2 - regeneracion");
        regeneracion.runCmd();

        // nivel 3 ataque
        System.out.println("LEVEL3 - ataque");
        ataque.runCmd();

        // nivel 4 contra ataque
        System.out.println("LEVEL4 - contraataque");
        contraAtaque.runCmd();
        contraAtaque.runCmd();
        contraAtaque.runCmd();




    }
}
