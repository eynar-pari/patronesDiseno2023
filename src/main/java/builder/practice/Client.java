package builder.practice;

public class Client {
    public static void main(String []args){
        Dispensador tecnico = new Dispensador();
        I7Medio i7Medio = new I7Medio();
        I9Alto i9Alto = new I9Alto();

        tecnico.setModel(i9Alto);
        tecnico.buildComputadora();

        Computadora pc1 = tecnico.getComputadora();
        pc1.showInfo();


    }

}
