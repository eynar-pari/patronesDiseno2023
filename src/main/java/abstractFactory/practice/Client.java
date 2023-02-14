package abstractFactory.practice;




public class Client {
    public static void main (String []args){

        Pasajero jose = new Pasajero("jose","123123");
        Pasajero juan = new Pasajero("juan","555555555");

        PasajeSolidario p1 = (PasajeSolidario) FactoryPasaje.make("solidario");
        PasajeSolidario p2 = (PasajeSolidario) FactoryPasaje.make("solidario");
        PasajeInfantes p3 = (PasajeInfantes) FactoryPasaje.make("infante");
        PasajeInfantes p4 = (PasajeInfantes) FactoryPasaje.make("infante");
        PasajeStandart p5 = (PasajeStandart) FactoryPasaje.make("standart");
        PasajeStandart p6 = (PasajeStandart) FactoryPasaje.make("standart");

        p1.setPasajero(jose);
        p2.setPasajero(juan);
        p3.setPasajero(jose);
        p4.setPasajero(juan);
        p5.setPasajero(jose);
        p6.setPasajero(juan);

        p1.showInfo();
        p2.showInfo();
        p3.showInfo();
        p4.showInfo();
        p5.showInfo();
        p6.showInfo();
    }

}
