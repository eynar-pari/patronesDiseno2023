package factoryMethod.practice;

public class CreatorPasajeStandart extends CreatorPasaje{

    @Override
    public PasajeStandart create(Pasajero pasajero) {
        PasajeStandart pasaje = new PasajeStandart();
        pasaje.setPasajero(pasajero);
        Avion avion = new Avion();
        avion.setCapacidad("1 tonelada");
        avion.setMarca("abc");
        avion.setModelo("modelo M");
        avion.setNumAsientos(100);
        pasaje.setAvion(avion);
        Pais origen = new Pais();
        origen.setAeropuerto("ar1");
        origen.setCiudad("LP");
        origen.setNombre("NA");
        pasaje.setOrigen(origen);
        Pais destino = new Pais();
        destino.setAeropuerto("ar2");
        destino.setCiudad("CBBA");
        destino.setNombre("NA1");
        pasaje.setDestino(destino);
        pasaje.setCostoPasaje("100bs");
        pasaje.setNumAsiento("5b");
        pasaje.setNumeroVuelo("LP608");

        return pasaje;
    }
}
