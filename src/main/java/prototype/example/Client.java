package prototype.example;

public class Client {

    public static void main(String[]args){
        EntradaStadium prototypeE = new EntradaStadium(
                new Equipo("Bolivia","24"),
                new Equipo("Brazil","24"),
                new Stadium("Hernando Siles","24000")
        );

        prototypeE.setFecha("07/07/2023");
        prototypeE.setLugar("La Paz");
        prototypeE.setPrecioEntrada("100bs");
        prototypeE.setNumeroAsiento(1);
        prototypeE.setPersona(new Persona("",""));
        prototypeE.showInfo();

        EntradaStadium entrada1 = prototypeE.clone();
        entrada1.setNumeroAsiento(2);
        entrada1.setPersona(new Persona("Jose","111"));

        EntradaStadium entrada2 = prototypeE.clone();
        entrada2.setNumeroAsiento(3);
        entrada2.setPersona(new Persona("Juan","1112"));

        EntradaStadium entrada3 = prototypeE.clone();
        entrada3.setNumeroAsiento(4);
        entrada3.setPersona(new Persona("Eynar","1113"));

        EntradaStadium entrada4 = prototypeE.clone();
        entrada4.setNumeroAsiento(5);
        entrada4.setPersona(new Persona("Maria","1114"));

        EntradaStadium entrada5 = prototypeE.clone();
        entrada5.setNumeroAsiento(6);
        entrada5.setPersona(new Persona("Pedro","1115"));
        System.out.println("*******************");
        entrada1.showInfo();
        entrada2.showInfo();
        entrada3.showInfo();
        entrada4.showInfo();
        entrada5.showInfo();
        entrada1.showInfo();
    }

}
