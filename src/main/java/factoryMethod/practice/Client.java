package factoryMethod.practice;

public class Client {

    public static void main(String []args){
        Pasajero jose = new Pasajero();
        jose.setName("jose");
        jose.setCi("12354");

        Pasajero juan = new Pasajero();
        juan.setName("juan");
        juan.setCi("12354");

        PasajeSolidario ps1 = new CreatorPasajeSolidario().create(jose);
        ps1.setNumAsiento("1b");
        PasajeSolidario ps2 = new CreatorPasajeSolidario().create(juan);
        ps2.setNumAsiento("1c");

        PasajeStandart pp1 = new CreatorPasajeStandart().create(jose);
        pp1.setNumAsiento("1b");
        PasajeStandart pp2 = new CreatorPasajeStandart().create(juan);
        pp2.setNumAsiento("1c");

        PasajeInfantes pi1 = new CreatorPasajeInfantes().create(jose);
        pi1.setNumAsiento("1b");
        PasajeInfantes pi2 = new CreatorPasajeInfantes().create(juan);
        pi2.setNumAsiento("1c");

        ps1.showInfo();
        ps2.showInfo();
        pp1.showInfo();
        pp2.showInfo();
        pi1.showInfo();
        pi2.showInfo();
    }
}
